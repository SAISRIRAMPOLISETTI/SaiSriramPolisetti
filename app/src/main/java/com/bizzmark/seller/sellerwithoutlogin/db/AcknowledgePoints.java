package com.bizzmark.seller.sellerwithoutlogin.db;

/**
 * Created by Tharun on 23-02-2017.
 */

public class AcknowledgePoints {

    String status;
    String earnRedeemString;

    public AcknowledgePoints(String status,String earnRedeemString){
        this.status=status;
        this.earnRedeemString=earnRedeemString;
    }

    public String getStatus()  {return status;    }

    public void setStatus(String status)  { this.status=status;   }


    public String getEarnRedeemString() {  return  earnRedeemString;   }

    public void setEarnRedeemString(String earnRedeemString) {

        this.earnRedeemString=earnRedeemString;
    }
}
