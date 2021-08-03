package com.kantar.lookup.application.lookupapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Lookup {

		@Id
        private int panelistId;
        private int householdId;
        private String userName;
        private String recruitedBy;
        private String optinStatus;
        private Boolean panelistStatus;
        private String role;
        private String local;
        private String currentOwner;
		
}
