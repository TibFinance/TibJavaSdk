
package com.tib.api.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AcpOperationType {

    Unkown(-1), NotSet(0), Depot_liste_de_paie(200), Liste_de_paie_speciale(201), Paie_de_vacances(202), Paie_heures_supplementaires_PAY(203), Paie_anticipee(204), Paie_de_commission(205), Paie_de_prime(206), Paie_de_rajustement(207), Pension(230), Pension_federale_PEN(231), Pension_provinciale(232), Pension_privee(233), Rente(240), Dividende(250), Dividende_act_Ordinaires_DVD(251), Dividende_act_Privilegiees(252), Placement(260), Fonds_mutuels_FMU(261), Regime_epargne_retraite_contribution_RER(271), Fonds_de_revenu_de_retraite_FRR(272), Interet(280), Gouvernement_federal(300), Paiements_de_stabilisation_agriculture_AGR(301), Commission_canadienne_du_lait_CCL(302), Credit_impot_pour_enfants_CIE(308), Taxe_sur_les_produits_et_services_TPS(309), Regime_de_pensions_du_Canada_RPC(310), Securite_de_la_vieillesse_SV(311), Allocations_aux_anciens_combattants_AAC(312), Commission_des_pensions_CCP(313), Allocations_familiales_AF(314), Pension_de_la_fonction_publique_PFP(315), Pension_de_retraite_des_Forces_armees_PFC(316), Remboursement_impot_RIF(317), Assurance_emploi_chomage_AC(318), Pret_aux_etudiants_ETU(320), Interet_OEC_OEC(321), Affaires_exterieures(322), Assurance(330), Assurance_vie(331), Assurance_automobile_ASS(332), Assurance_biens(333), Assurance_accidents_et_risques_divers(334), Assurance_hypothecaire(335), Sante_dentaire_reclamation_ass_SDR(336), Prets(350), Prets_personnels(351), Prets_de_plan_de_vendeur_PRE(352), Prets_pour_amelioration_des_fermes(353), Prets_pour_amelioration_des_residences(354), Prets_a_terme(355), Prets_assurance_PRE(356), Hypotheque(370), Hypotheque_sur_residence_HYP(371), Hypotheque_commerciale(372), Hypotheque_sur_ferme(373), Taxes(380), Impot_sur_le_revenu(381), Taxes_de_vente(382), Impot_sur_les_corporations_TAX(383), Taxes_scolaires(384), Taxes_foncieres(385), Taxes_eau(386), Loyers_baux(400), Loyers_baux_pour_residences(401), Loyers_baux_commerciaux_LOY(402), Loyers_baux_materiel(403), Loyers_baux_automobile(404), Loyers_baux_appareils(405), Gestion_espÃ(420), Paiement_de_facture_de_telephone(431), Paiement_de_facture_essence(432), Paiement_de_facture_electricite_FAC(433), Paiement_de_facture_de_cable(434), Paiement_de_facture_de_combustible(435), Paiement_de_facture_entreprise_de_services_publics(436), Paiement_acces_Internet_PAI(437), Paiments_divers(450), Cheques_des_clients_CHP(451), Remboursement_de_depenses_RDD(452), Comptes_debiteurs_CC(460), Frais_FEE(470), Don_DON(480), Gouvernement_provincial(600), Regime_des_obligations_familiales_ROF(601), Allocation_logement_LOG(602), Prestation_securite_du_revenu_PSR(603), Prestation_familiale_provinciale_PFA(604), Paiement_entente_federale_provinciale_FPT(605), CSST_CST(606), Allocation_aide_a_emploi_AAE(607), Regime_assurance_automobile_RAA(608), DPA_entreprise(700), Commercial_Placements(701), Commercial_Assurance_ASE(702), Commercial_Assurance_automobile_AUE(703), Commercial_Assurance_de_biens_ABE(704), Commercial_Assurance_IARD_ARE(705), Commercial_Assurance_hypothecaire_AHE(706), Commercial_Prets_PEE(707), Commercial_Pret_hypothecaire_HYE(708), Commercial_Taxes_TXE(709), Commercial_Impots_sur_le_revenu_IRE(710), Commercial_Taxes_de_vente_TVE(711), Commercial_TPS_TPE(712), Commercial_Taxes_foncieres_TFE(713), Commercial_Loyer_bail_LBE(714), Commercial_Location_de_materiel_LBE(715), Commercial_Location_automobile_LAE(716);

    private int value;

    private AcpOperationType(int value) {
        this.value =value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}