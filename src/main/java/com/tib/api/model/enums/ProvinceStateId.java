
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ProvinceStateId {

    Unkown(-1), NotSet(0), CA_Alberta(1), CA_BritishColumbia(2), CA_Manitoba(3), CA_NewBrunswick(4), CA_Newfoundland(5), CA_NovaScotia(6), CA_Nunavut(7), CA_Ontario(8), CA_PrinceEdwardIsland(9), CA_Quebec(10), CA_Saskatchewan(11), CA_NorthwestTerritories(12), CA_YukonTerritory(13), US_ArmedForcesAmericas(14), US_ArmedForcesEuropeAndMiddleEastAndCanada(15), US_Alaska(16), US_Alabama(17), US_ArmedForcesPacific(18), US_Arkansas(19), US_AmericanSamoa(20), US_Arizona(21), US_California(22), US_Colorado(23), US_Connecticut(24), US_DistrictofColumbia(25), US_Delaware(26), US_Florida(27), US_FederatedStatesofMicronesia(28), US_Georgia(29), US_Guam(30), US_Hawaii(31), US_Iowa(32), US_Idaho(33), US_Illinois(34), US_Indiana(35), US_Kansas(36), US_Kentucky(37), US_Louisiana(38), US_Massachusetts(39), US_Maryland(40), US_Maine(41), US_MarshallIslands(42), US_Michigan(43), US_Minnesota(44), US_Missouri(45), US_NorthernMarianaIslands(46), US_Mississippi(47), US_Montana(48), US_NorthCarolina(49), US_NorthDakota(50), US_Nebraska(51), US_NewHampshire(52), US_NewJersey(53), US_NewMexico(54), US_Nevada(55), US_NewYork(56), US_Ohio(57), US_Oklahoma(58), US_Oregon(59), US_Pennsylvania(61), US_PuertoRico(62), US_Palau(63), US_RhodeIsland(64), US_SouthCarolina(65), US_SouthDakota(66), US_Tennessee(67), US_Texas(68), US_Utah(69), US_Virginia(70), US_VirginIslands(71), US_Vermont(72), US_Washington(73), US_WestVirginia(74), US_Wisconsin(75), US_Wyoming(76);

    private int value;

    private ProvinceStateId(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}