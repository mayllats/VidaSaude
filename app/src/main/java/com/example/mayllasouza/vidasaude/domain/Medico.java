package com.example.mayllasouza.vidasaude.domain;

public class Medico {

        private String ID;
        private String MED_NOME;
        private String MED_CRM;
        private String FK_ESP;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getMEDNOME() {
            return MED_NOME;
        }

        public void setMEDNOME(String MED_NOME) {
            this.MED_NOME = MED_NOME;
        }

        public String getMEDCRM() {
            return MED_CRM;
        }

        public void setMEDCRM(String MED_CRM) {
            this.MED_CRM = MED_CRM;
        }

        public String getFKESP() {
            return FK_ESP;
        }

        public void setFKESP(String FK_ESP) {
            this.FK_ESP = FK_ESP;
        }

    }
