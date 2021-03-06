package kz.greetgo.sandbox.db.dao;

import kz.greetgo.sandbox.controller.model.UserInfo;
import kz.greetgo.sandbox.controller.register.model.UserParamName;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AuthDao {
  void saveUserParam(String personId, UserParamName name, String value);

  @Select("Select value from UserParams where personId = #{personId} and name = #{name}")
  String getUserParam(@Param("personId") String personId,
                      @Param("name") UserParamName name);

  @Select("Select id from Person where accountName = #{accountName} " +
    "and encryptedPassword = #{encryptedPassword} and blocked = 0")
  String selectPersonIdByAccountAndPassword(@Param("accountName") String accountName,
                                            @Param("encryptedPassword") String encryptedPassword);

  @Select("Select accountName from Person where id = #{personId}")
  String accountNameByPersonId(@Param("personId") String personId);

  @Select("Select * from Person where id = #{personId}")
  UserInfo getUserInfo(@Param("personId") String personId);
}
