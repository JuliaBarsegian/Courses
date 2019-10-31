package HW_25_10_19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardValidator {
    public static void main(String[] args) {
        DebitCardValidator card = new DebitCardValidator("4851 1514 4158 2154", "02/20", "415", "Julia Barsegian", "VISA");
        card.validator(card.getCardNumber(), card.getDate(), card.getCVV(), card.getOwner(), card.getType());
    }

    public static class DebitCardValidator {
        private String cardNumber;
        private String date;
        private String CVV;
        private String owner;
        private String type;

        DebitCardValidator(String cardNumber, String date, String CVV, String owner, String type) {
            this.cardNumber = cardNumber;
            this.date = date;
            this.CVV = CVV;
            this.owner = owner;
            this.type = type;
        }

        String getCardNumber() {
            return cardNumber;
        }

        String getDate() {
            return date;
        }

        String getCVV() {
            return CVV;
        }

        String getOwner() {
            return owner;
        }

        String getType() {
            return type;
        }

        void validator(String cardNumber, String date, String CVV, String owner, String type) {
            Pattern cardNumberPattern = Pattern.compile("^4[0-9]{12}(?:[0-9]{3})?$");
            Pattern datePattern = Pattern.compile("^(0[0-9]||1[0-9])/([2-9][0-9])");
            Pattern CVVPattern = Pattern.compile("[0-9]{3}");
            Pattern ownerPattern = Pattern.compile("^[A-Za-z]{1,20}$");
            Pattern typePattern = Pattern.compile("^[A-Za-z]");

            Matcher cardNumberMatcher = cardNumberPattern.matcher(cardNumber);
            Matcher dateMatcher = datePattern.matcher(date);
            Matcher CVVMatcher = CVVPattern.matcher(CVV);
            Matcher ownerMatcher = ownerPattern.matcher(owner);
            Matcher typeMatcher = typePattern.matcher(type);

            {
                if (cardNumberMatcher.matches() && dateMatcher.matches() && CVVMatcher.matches() && ownerMatcher.matches() && typeMatcher.matches()) {
                    System.out.println("Данные карты валидны:\n" + "Номер карты: " + cardNumber + "\nСрок действия: " + date + "\nCVV код: " + CVV + "\nВладелец карты: " + owner + "\nВид карты: " + type);
                } else {
                    System.out.println("Данные карты не валидны");
                }
            }
        }
    }
}
