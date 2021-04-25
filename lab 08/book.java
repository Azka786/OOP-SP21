/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08_assigment_01;

/**
 *
 * @author Azka Malik
 */
public class book extends publication{
    int page;

    public book(String title , int page, int price) {
        super(title, price);
        this.page = page;
    }
    

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    public void page_count(){
        page++;
    }

    /**
     *
     */
    @Override
    public void display(){
        super.display();
       System.out.println("the page number is "+page) ;
    }
   
}
