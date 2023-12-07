import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MoneyEvent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoneyEvent extends Event
{
    public MoneyEvent(int choice) {
        super("You invested in some sort of stock", 10.00, 0);
        Income income = new Income();
        switch(choice){  
            case 1:
                setDescription("You got paid \nBalance: + " + String.valueOf(income.getIncome()*1.00));
                setEventMoney(income.getIncome()*1.0);
                setEventCredit(0);
                break;
            case 2:
                setDescription("You were approved for a car loan\n Credit Score:-30");
                setEventMoney(0);
                setEventCredit(-30);
            case 3:
                setDescription("You got a bonus\nBalance: +$1000 "); 
                setEventMoney(1000);
                setEventCredit(0);
                break;
            case 5:
                setDescription("You got a loan for college\n Credit Score:-25 "); 
                setEventMoney(0);
                setEventCredit(-25);
                break;
            case 6:
                setDescription("You had a medical expense\n Balance: -$400 "); 
                setEventMoney(-400);
                setEventCredit(0);
                break;
            case 7:
                setDescription("You missed work\n Balance: - " + String.valueOf(income.getIncome()*.1)); 
                setEventMoney(-income.getIncome()*.1);
                setEventCredit(0);
                break;
            case 8:
                setDescription("You paid car insurance\n Balance: -$50.32 "); 
                setEventMoney(-50.32);
                setEventCredit(0);
                break;
            case 9:
                setDescription("You paid health insurance\n Balance:-$125.25 "); 
                setEventMoney(-125.25);
                setEventCredit(0);
                break;
            case 10:
                setDescription("You got a credit card\n Credit Score:-20"); 
                setEventMoney(0);
                setEventCredit(-20);
                break;
            case 11:
                setDescription("You paid your credit card balance\n Credit Score:+20 "); 
                setEventMoney(0);
                setEventCredit(20);
                break;
            case 12:
                setDescription("You have not missed any payments\n Credit Score:+5 "); 
                setEventMoney(0);
                setEventCredit(5);
                break;
            case 13:
                setDescription("You made a lump sum payment on your loan\n Credit Score:+40 "); 
                setEventMoney(0);
                setEventCredit(40);
                break;
            case 14:
                setDescription("You became an authorized user on a credit card\n Credit Score:+12 "); 
                setEventMoney(0);
                setEventCredit(20);
                break;
            case 15:
                setDescription("Your credit limit increased \n Credit Score:+20 "); 
                setEventMoney(0);
                setEventCredit(20);
                break;
            case 16:
                setDescription("You missed a car payment \n Credit Score:-30 "); 
                setEventMoney(0);
                setEventCredit(-30);
                break;
            case 17:
                setDescription("You missed a credit card Payment \n Credit Score:-20 "); 
                setEventMoney(0);
                setEventCredit(-20);
                break;
            case 18:
                setDescription("You missed your rent payment \n Credit Score:-20  "); 
                setEventMoney(0);
                setEventCredit(-20);
                break;
            case 19:
                setDescription("You received a tax refund\nBalance: +$800.00");
                setEventMoney(800.00);
                setEventCredit(50);
                break;
            case 21:
                setDescription("You invested in cryptocurrency\nBalance: -$50.00");
                setEventMoney(-250.00);
                setEventCredit(0);
                break; 
            case 23:
                setDescription("You donated to a charity\nBalance: -$20.00");
                setEventMoney(-20.00);
                setEventCredit(0);
                break;
            case 24:
                setDescription("You received a gift from a friend\nBalance: +$30.00");
                setEventMoney(30.00);
                setEventCredit(1);
                break;  
            case 26:
                setDescription("You made a successful stock trade\nBalance: +$120.00");
                setEventMoney(120.00);
                setEventCredit(5);
                break;
            case 27:
                setDescription("You purchased a new gadget\nBalance: -$200.00");
                setEventMoney(-200.00);
                setEventCredit(-2);
                break;
            case 28:
                setDescription("You paid your credit card bill on time: + 20");
                setEventMoney(0);
                setEventCredit(20);
                break;
                //choice events
                
                
                
            case 29:
                setDescription("You can choose to pay off one of your\n biggest debts now or pay it later.\n What do you do?");
                setEventMoney(0);
                setEventCredit(0);
                break;
            case 37:
                setDescription("You chose to pay off your debt now\n rather then later \n+ Credit Score: +50\n -$25000");
                setEventMoney(-25000);
                setEventCredit(50);
                break;
            case 34:
                setDescription("You chose to save your current money.");
                setEventMoney(0);
                setEventCredit(0);
                break;
            case 30:
                setDescription("You have the option to take a new job\n will you take it?");
                setEventMoney(0);
                setEventCredit(0);
                break;
            case 33:
                setDescription("You chose not to take the job.");
                setEventMoney(0);
                setEventCredit(0);
                break;
            
                
                
            case 31:
                setDescription("You found a financial advisor who offers \ninvestment advice.\nDo you want to consult the financial advisor?");
                setEventMoney(0);
                setEventCredit(0);
                break;
            case 35:
                setDescription("You decided to consult the financial advisor. -$100.00\nCredit Score: +20");
                setEventMoney(-100.00);
                setEventCredit(20);
                break;
            case 36:
                setDescription("You opted not to consult the financial advisor.");
                setEventMoney(0);
                setEventCredit(0);
                break;
                
                
            case 32:
                setDescription("You have the opportunity to attend a financial literacy workshop.\nDo you want to attend?");
                setEventMoney(0);
                setEventCredit(0);
                break;
            case 38:
                setDescription("You attended the financial literacy workshop.\nCredit Score: +15");
                setEventMoney(0);
                setEventCredit(15);
                break;
            case 39:
                setDescription("You chose not to attend the financial literacy workshop.");
                setEventMoney(0);
                setEventCredit(0);
                break;
                
                
                
            case 40:
                setDescription("You chose to take a new job, as a sign on bonus \n + $5000");
                setEventMoney(5000);
                setEventCredit(0);
                break;
               
                
                
            case 0:
                setDescription("You inherit money from a distant relative. \n Do you invest/save it or buy the new car?"); 
                setEventMoney(10000);
                break;
            case 41:
                setDescription("You chose to invest your money! \n + $10000");
                setEventMoney(10000);
                setEventCredit(0);
                break;
            case 42:
                setDescription("You chose buy a new car, \ninstead of investing/saving. \n - $10000");
                setEventMoney(-10000);
                setEventCredit(0);
                break;
                
                
            case 4:
                setDescription("You receive a job offer with a higher salary,\n but it's in a more expensive city. \nShould you relocate and or stay where you are?"); 
                setEventMoney(-2000);
                setEventCredit(0);
                break;    
            case 43:
                setDescription("You chose to relocate, but your \ncost of living increased so much, \n the raise wasn't worth it. \n - $5000");
                setEventMoney(-5000);
                setEventCredit(0);
                break;
            case 44:
                setDescription("You chose to stay where you are. \nYour boss decided to give you a bonus! \n + $5000");
                setEventMoney(5000);
                setEventCredit(0);
                break;
              
                
            case 20:
                setDescription("You want to buy Christmas Gifts.\n You could use credit, but you can't pay it off.\n Should you buy the gifts and use credit?");
                setEventMoney(0);
                setEventCredit(-10);
                break;    
            case 45:
                setDescription("You chose to use the credit card \nand was unable to pay it back. \n - 30");
                setEventMoney(0);
                setEventCredit(-30);
                break;
            case 46:
                setDescription("You chose not to use the card, \nand find a cheaper gift! \n + 10");
                setEventMoney(0);
                setEventCredit(10);
                break;
            
                
                
            case 25:
                setDescription("Your relative bought you stocks as a birthday gift. \nShould you keep the stock or sell it?");
                setEventMoney(0);
                setEventCredit(0);
                break;    
            case 47:
                setDescription("You chose to keep the stocks and made \nmore money in the long run! \n + $3000");
                setEventMoney(3000);
                setEventCredit(10);
                break;
            case 48:
                setDescription("You chose to sell the stocks, \nand missed a giant value increase. \n - $1500");
                setEventMoney(-1500);
                setEventCredit(10);
                break;
            
                
                
            case 22:
                setDescription("You want to buy your dream car, but you're broke.\n Should you take out a loan \nor wait until you have enough cash?");
                setEventMoney(0);
                setEventCredit(0);
                break;
            case 49:
                setDescription("You chose to take out a loan, and \nare struggling to pay it back. \n - 30");
                setEventMoney(0);
                setEventCredit(-30);
                break;
            case 50:
                setDescription("You chose to wait/find a cheaper car! \n + 30");
                setEventMoney(0);
                setEventCredit(30);
                break;
                
        }
    }

    public void act() {
        super.act(); // Call the parent class's act method to update the character's attributes.
    }
    
    
}