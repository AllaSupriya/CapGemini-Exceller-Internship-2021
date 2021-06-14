import { Component, OnInit } from '@angular/core';


interface PackageDetails
{
  packageName:string,
  packageCost : number,
  days: number,
  selected : boolean,
}

@Component({
  selector: 'app-maincomponent',
  templateUrl: './maincomponent.component.html',
  styleUrls: ['./maincomponent.component.css']
})
export class MaincomponentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  userCost:number = 0;
  isAccepted:boolean = false;

  package : PackageDetails= {
     packageName:"Goa-Tour Package",
     packageCost : 50000,
     days: 2,
     selected : false,
     
  };

  name = "ramesh";
  isHidden = true;

  doBuyPackage()
  {
    this.package.selected = true;
  }

  getCostFromUser(userCost:string)
  {
    let newUserCost:number = parseInt(userCost);
    this.userCost = newUserCost;
    if(this.userCost>40000)
    {
      this.isAccepted = true;
    }
  }

  getAllPackages():PackageDetails[]
  {
    let package1 : PackageDetails= {
      packageName:"Goa-Tour Package-1",
      packageCost : 50000,
      days: 2,
      selected : false,
     };
     let package2 : PackageDetails= {
      packageName:"Goa-Tour Package-2",
      packageCost : 60000,
      days: 4,
      selected : false,
     };
     let package3 : PackageDetails= {
      packageName:"Goa-Tour Package-3",
      packageCost : 90000,
      days: 6,
      selected : false,
     };
     
     return [package1,package2,package3];
     

  }



}//end class
