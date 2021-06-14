import { DemoComponent } from './demo/demo.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import { LinkcomponentComponent } from './linkcomponent/linkcomponent.component';
import { StockComponent } from './stock/stock.component';
import { TodoComponent } from './todo/todo.component'

@NgModule({
  declarations: [
    AppComponent,
    DemoComponent,
    LinkcomponentComponent,
    StockComponent,
    TodoComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
