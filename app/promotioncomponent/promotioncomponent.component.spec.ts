import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PromotioncomponentComponent } from './promotioncomponent.component';

describe('PromotioncomponentComponent', () => {
  let component: PromotioncomponentComponent;
  let fixture: ComponentFixture<PromotioncomponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PromotioncomponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PromotioncomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
