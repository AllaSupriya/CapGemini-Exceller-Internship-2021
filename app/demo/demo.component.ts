import { Component } from "@angular/core";


@Component({
    selector:'demo-tag',
    templateUrl:'./demo.component.html',
    styleUrls:['./demo.component.css']
})
export class DemoComponent
{
    username = "Ramesh"; // replace from json input from server
    status = true;

    doThings():string
    {
        return "Hello";
    }
}