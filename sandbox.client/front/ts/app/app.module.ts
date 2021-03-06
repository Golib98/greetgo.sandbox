import {NgModule} from "@angular/core";
import {HttpModule, JsonpModule} from "@angular/http";
import {FormsModule} from "@angular/forms";
import {BrowserModule} from "@angular/platform-browser";
import {RootComponent} from "./root.component";
import {LoginComponent} from "./input/login.component";
import {HttpService} from "./HttpService";
import {ListComponent} from "./clients/list.component";
import {MainFormComponent} from "./main_form/main_form.component";
import {ChangeClientComponent} from "./clients/change.component";
import {ClientListPagination} from "./pagination/pagination.component";

@NgModule({
  imports: [
    BrowserModule, HttpModule, JsonpModule, FormsModule
  ],
  declarations: [
    RootComponent, LoginComponent, MainFormComponent, ListComponent, ChangeClientComponent, ClientListPagination
  ],
  bootstrap: [RootComponent],
  providers: [HttpService],
  entryComponents: [],
})
export class AppModule {
}