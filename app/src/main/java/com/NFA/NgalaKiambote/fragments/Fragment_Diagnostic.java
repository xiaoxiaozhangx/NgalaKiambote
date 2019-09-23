package com.NFA.NgalaKiambote.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.NFA.NgalaKiambote.R;
import com.NFA.NgalaKiambote.adapters.Adapter_Medicinal_Plants;
import com.NFA.NgalaKiambote.models.Model_Medicinal_Plants;

import java.util.ArrayList;

public class Fragment_Diagnostic extends Fragment {

    public Fragment_Diagnostic() {

    }

    private RecyclerView mRecyclerMedicinalPlants;
    Adapter_Medicinal_Plants mAdapterMedicinalPlants;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_diagnostic, container, false);

        mRecyclerMedicinalPlants = view.findViewById(R.id.mRecyclerMedicinalPlants);

        /*mRecyclerMedicinalPlants.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapterMedicinalPlants = new Adapter_Medicinal_Plants(getActivity(), getListPlants());
        mRecyclerMedicinalPlants.setAdapter(mAdapterMedicinalPlants);*/

        return view;
    }

   /* private ArrayList<Model_Medicinal_Plants> getListPlants() {
        ArrayList<Model_Medicinal_Plants> modelPlantsMedicals = new ArrayList<>();

        Model_Medicinal_Plants p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Abcesso");
        p.setCommon_name("Nome vernáculo: Sankulu(Kikongo), okandala-kazengue(Umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas), infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas, Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas mais ou mmenos mosqueadas, em ambas às páginas, de pintas brancas, revestidas nas margens de espinhos deltóides, Flores em racemos, vermelhas. Fruto, uma cápsula oblongo-trigonal.");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Acne");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Aftas");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_achyranthes_aspera);
        p.setName("Alívio de Sintomas de paludismo");
        p.setCommon_name("Nome vernánculo: Não encontrado");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Benguela, Namibe;");
        p.setUse("Utitlidade: Usadas para diversos fins medicinais, como indução de parto e cessação de hemorragia pós-parto. Usada no alívio de sintomas de paludismo.");
        p.setHabitat("Habitat: Florestas e Savanas;");
        p.setSpecies_description("Descrição de espécie: Herbácea perene de 1m de altura, lenhosa na base, erecta, mediamente ramificadas, caule pubescente. Folhas opostas, largamente ovadas ou rômbicas, curtamente acuminadas no ápice, acunheadas na base. Flores paniculadas, erectas, pediceladas, tornando-se refletidas, verdes. Fruto, utrículo refletido, cilíndrico. E possui uma emente leticular preta.");
        p.setParts_used("Parte utilizada: Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Amenorreia");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Amigdalite");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_thunbergia_lancifolia_t_anderson);
        p.setName("Anemia");
        p.setCommon_name("Nome vernáculo: não encontrado;");
        p.setGeographical_location("Localização geográfica: Kwanza norte, Malange;");
        p.setUse("Utitlidade: tratamento de dores de cabeça, inflamações, bilharziose, doenças da pele, menstruação iregular, vómitos, paludismo, anemia.");
        p.setHabitat("Habitat: Florestas e Savanas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Raíz e Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_amaranthus_caudatus);
        p.setName("Anti-helmíntico");
        p.setCommon_name("Nome vernáculo: Kimboa(kikongo), Jimboa ou mboa(Kimbundo), Mulenje(Kioko);");
        p.setGeographical_location("Localização geográfica: Em todo paíz;");
        p.setUse("Utitlidade: Anti-helmíntico, cicatrização de feridas e usada como diurético.");
        p.setHabitat("Habitat: Terrenos húmidos");
        p.setSpecies_description("Descrição da espécie:Herbácea anual de 1m de altura. Folhas indivisas, sem estípulas, estreitamente elípticas. Flores monóicas. Fruto, uma capsula transversalmente deiscente, semente com tegumento crustáceo, preto ou fusco.;");
        p.setParts_used("Parte utilizada: Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Artrite");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Asma");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_thunbergia_lancifolia_t_anderson);
        p.setName("Bilharziose");
        p.setCommon_name("Nome vernáculo: Não encontrado;");
        p.setGeographical_location("Localização geográfica: Kwanza Norte e Malange;");
        p.setUse("Utitlidade: Tratamento de dores de cabeça, inflamações, bilharziose, doenças da pele, menstruação iregular, vómitos, paludismo, anemia.");
        p.setHabitat("Habitat: Florestas e Savanas");
        p.setSpecies_description("Descrição da espécie: Herbácea vivaz erecta ou subarvusto de 90cm de altura. Folhas simples, opostas, subsésseis, elípticas-oblanceoladas, gleabras. Flores solitárias, axilares, grandes, violetas cenro amarelo, zigomórficas. Fruto, uma cápsula com pubescência fina;");
        p.setParts_used("Parte utilizada: Raíz e Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Bilharziose");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Cancro da prostata");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Cancro de pele");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Caspa");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Caspa");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_achyranthes_aspera);
        p.setName("Cessação de hemorragia pós-parto");
        p.setCommon_name("Nome vernánculo: Não encontrado");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Benguela, Namibe;");
        p.setUse("Utitlidade: Usadas para diversos fins medicinais, como indução de parto e cessação de hemorragia pós-parto. Usada no alívio de sintomas de paludismo.");
        p.setHabitat("Habitat: Florestas e Savanas;");
        p.setSpecies_description("Descrição de espécie: Herbácea perene de 1m de altura, lenhosa na base, erecta, mediamente ramificadas, caule pubescente. Folhas opostas, largamente ovadas ou rômbicas, curtamente acuminadas no ápice, acunheadas na base. Flores paniculadas, erectas, pediceladas, tornando-se refletidas, verdes. Fruto, utrículo refletido, cilíndrico. E possui uma emente leticular preta.");
        p.setParts_used("Parte utilizada: Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_amaranthus_caudatus);
        p.setName("Cicatrização de feridas");
        p.setCommon_name("Nome vernáculo: Kimboa(kikongo), Jimboa ou mboa(Kimbundo), Mulenje(Kioko);");
        p.setGeographical_location("Localização geográfica: Em todo paíz;");
        p.setUse("Utitlidade: Anti-helmíntico, cicatrização de feridas e usada como diurético.");
        p.setHabitat("Habitat: Terrenos húmidos");
        p.setSpecies_description("Descrição da espécie:Herbácea anual de 1m de altura. Folhas indivisas, sem estípulas, estreitamente elípticas. Flores monóicas. Fruto, uma capsula transversalmente deiscente, semente com tegumento crustáceo, preto ou fusco.;");
        p.setParts_used("Parte utilizada: Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Cólicas");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_allium_sativum_l);
        p.setName("Cólicas de recém nascido");
        p.setCommon_name("Nome vernáculo: Alho");
        p.setGeographical_location("Localização geográfica: Em todo país;");
        p.setUse("Utitlidade: É regulador de tensão arterial, indicado para o tratamento de tosse e dores de ouvido. É antigripal, anti-inflamatório, antibiótico, anti-séptico. Indicado para indisposição e para cólicas de recém-nascido.");
        p.setHabitat("Habitat: Savanas, lugares húmido");
        p.setSpecies_description("Descrição da espécie: Herbácea perene, aromática de 0,4 a 0,6m de altura, caule pequeno e achatado, folhas lineares, alongadas, cerosas. Flores hermafroditas, brancas ou avermelhadas;");
        p.setParts_used("Parte utilizada: Bolbo e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Cólon espamódico");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Constipação");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Constipação");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Depressão");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Diabetes");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_anacardium_occidentale_l);
        p.setName("Diabetes");
        p.setCommon_name("Nome vernáculo: Cajueiro;");
        p.setGeographical_location("Localização geográfica: Cabinda, Zaire, Bengo, Luanda, Kwanza Sul(é cultivável em todas as províncias);");
        p.setUse("Utitlidade: Usada no tratamento de diarreias, dores abdominais, inflamação, diabetes. Diminui o nível de colesterol no sangue.A casca da árvore também é utilizda como adstringente e tónico.");
        p.setHabitat("Habitat: Florestas, Savanas, Zonas ruderais.");
        p.setSpecies_description("Descrição da espécie: pequena árvore, perene, com tronco curto, sinuoso, com ritidoma cinza e fissurado, de 5 a 12m altura. Copa com ramos terminais pilosos. Folhas simples, espiraladas, alternadas, coriáceas ou semi-coriáceas , concolores, glabras, ovado-obovadas, ápice arredondado, base aguda. Flores paniculadas, rosas. fruto, uma drupa, cinza, pseudofruto vermelho ou amarelado, quando maduror, suculento e carnudo.");
        p.setParts_used("Parte utilizada: Cascas do tronco e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_crinum_macowanii_baker);
        p.setName("Diarreia de sangue");
        p.setCommon_name("Nome vernáculo: Lírio-do-rio(português), Niaza kongo(kikongo);");
        p.setGeographical_location("Localização geográfica: Zaire, Malange, Kwanza Norte;");
        p.setUse("Utitlidade: Usada no tratamento de febres, reumatismo, infecções(urinária e cutânea) também é usada em casos de dilatação das glândulas e de inchanços dolorosos da pele. A infusão e a decocção do bolbo e das folhas servem para o tratamento de tuberculose, febres reumáticas, dores de bexiga e diarreia de sangue.");
        p.setHabitat("Habitat: Florestas e savanas, ocorre nas encostas das montanhas, em áreas rochosas, húmidas e ribeirinhas. Cultivadas em jardins.");
        p.setSpecies_description("Descrição da espécie: Herbácea de 90cm, bolbo largo, estreitando-se num caule curto. Folhas lineares dispostas em rosetas, patentes ou arqueadas subsésseis, com margens mais ou menos onduladas. Flores campanuladas, brancas ou cores-de-rosa. Fruto com aproximadamente 6cm de diâmetro.");
        p.setParts_used("Parte utilizada: Folha e boldo(Nota: devido a sua toxicidade, não pode ser usado de forma isolada, pois o bolbo tem grandes quantidades de alcalóides.)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_anacardium_occidentale_l);
        p.setName("Diarreias");
        p.setCommon_name("Nome vernáculo: Cajueiro;");
        p.setGeographical_location("Localização geográfica: Cabinda, Zaire, Bengo, Luanda, Kwanza Sul(é cultivável em todas as províncias);");
        p.setUse("Utitlidade: Usada no tratamento de diarreias, dores abdominais, inflamação, diabetes. Diminui o nível de colesterol no sangue.A casca da árvore também é utilizda como adstringente e tónico.");
        p.setHabitat("Habitat: Florestas, Savanas, Zonas ruderais.");
        p.setSpecies_description("Descrição da espécie: pequena árvore, perene, com tronco curto, sinuoso, com ritidoma cinza e fissurado, de 5 a 12m altura. Copa com ramos terminais pilosos. Folhas simples, espiraladas, alternadas, coriáceas ou semi-coriáceas , concolores, glabras, ovado-obovadas, ápice arredondado, base aguda. Flores paniculadas, rosas. fruto, uma drupa, cinza, pseudofruto vermelho ou amarelado, quando maduror, suculento e carnudo.");
        p.setParts_used("Parte utilizada: Cascas do tronco e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_crinum_macowanii_baker);
        p.setName("Dilatação das glândulas");
        p.setCommon_name("Nome vernáculo: Lírio-do-rio(português), Niaza kongo(kikongo);");
        p.setGeographical_location("Localização geográfica: Zaire, Malange, Kwanza Norte;");
        p.setUse("Utitlidade: Usada no tratamento de febres, reumatismo, infecções(urinária e cutânea) também é usada em casos de dilatação das glândulas e de inchanços dolorosos da pele. A infusão e a decocção do bolbo e das folhas servem para o tratamento de tuberculose, febres reumáticas, dores de bexiga e diarreia de sangue.");
        p.setHabitat("Habitat: Florestas e savanas, ocorre nas encostas das montanhas, em áreas rochosas, húmidas e ribeirinhas. Cultivadas em jardins.");
        p.setSpecies_description("Descrição da espécie: Herbácea de 90cm, bolbo largo, estreitando-se num caule curto. Folhas lineares dispostas em rosetas, patentes ou arqueadas subsésseis, com margens mais ou menos onduladas. Flores campanuladas, brancas ou cores-de-rosa. Fruto com aproximadamente 6cm de diâmetro.");
        p.setParts_used("Parte utilizada: Folha e boldo(Nota: devido a sua toxicidade, não pode ser usado de forma isolada, pois o bolbo tem grandes quantidades de alcalóides.)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_anacardium_occidentale_l);
        p.setName("Diminuição de colesterol no sangue");
        p.setCommon_name("Nome vernáculo: Cajueiro;");
        p.setGeographical_location("Localização geográfica: Cabinda, Zaire, Bengo, Luanda, Kwanza Sul(é cultivável em todas as províncias);");
        p.setUse("Utitlidade: Usada no tratamento de diarreias, dores abdominais, inflamação, diabetes. Diminui o nível de colesterol no sangue.A casca da árvore também é utilizda como adstringente e tónico.");
        p.setHabitat("Habitat: Florestas, Savanas, Zonas ruderais.");
        p.setSpecies_description("Descrição da espécie: pequena árvore, perene, com tronco curto, sinuoso, com ritidoma cinza e fissurado, de 5 a 12m altura. Copa com ramos terminais pilosos. Folhas simples, espiraladas, alternadas, coriáceas ou semi-coriáceas , concolores, glabras, ovado-obovadas, ápice arredondado, base aguda. Flores paniculadas, rosas. fruto, uma drupa, cinza, pseudofruto vermelho ou amarelado, quando maduror, suculento e carnudo.");
        p.setParts_used("Parte utilizada: Cascas do tronco e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_thunbergia_lancifolia_t_anderson);
        p.setName("Doenças da pele");
        p.setCommon_name("Nome vernáculo: Não encontrado;");
        p.setGeographical_location("Localização geográfica: Kwanza norte e Malange;");
        p.setUse("Utitlidade: Tratamento de dores de cabeça, inflamações, bilharziose, doenças da pele, menstruação iregular, vómitos, paludismo, anemia.");
        p.setHabitat("Habitat: Florestas e Savanas");
        p.setSpecies_description("Descrição da espécie: Herbácea vivaz erecta ou subarvusto de 90cm de altura. Folhas simples, opostas, subsésseis, elípticas-oblanceoladas, gleabras. Flores solitárias, axilares, grandes, violetas cenro amarelo, zigomórficas. Fruto, uma cápsula com pubescência fina;");
        p.setParts_used("Parte utilizada: Raíz e Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_anacardium_occidentale_l);
        p.setName("Dores abdominais");
        p.setCommon_name("Nome vernáculo: Cajueiro;");
        p.setGeographical_location("Localização geográfica: Cabinda, Zaire, Bengo, Luanda, Kwanza Sul(é cultivável em todas as províncias);");
        p.setUse("Utitlidade: Usada no tratamento de diarreias, dores abdominais, inflamação, diabetes. Diminui o nível de colesterol no sangue.A casca da árvore também é utilizda como adstringente e tónico.");
        p.setHabitat("Habitat: Florestas, Savanas, Zonas ruderais.");
        p.setSpecies_description("Descrição da espécie: pequena árvore, perene, com tronco curto, sinuoso, com ritidoma cinza e fissurado, de 5 a 12m altura. Copa com ramos terminais pilosos. Folhas simples, espiraladas, alternadas, coriáceas ou semi-coriáceas , concolores, glabras, ovado-obovadas, ápice arredondado, base aguda. Flores paniculadas, rosas. fruto, uma drupa, cinza, pseudofruto vermelho ou amarelado, quando maduror, suculento e carnudo.");
        p.setParts_used("Parte utilizada: Cascas do tronco e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_crinum_macowanii_baker);
        p.setName("Dores de bexiga");
        p.setCommon_name("Nome vernáculo: Lírio-do-rio(português), Niaza kongo(kikongo);");
        p.setGeographical_location("Localização geográfica: Zaire, Malange, Kwanza Norte;");
        p.setUse("Utitlidade: Usada no tratamento de febres, reumatismo, infecções(urinária e cutânea) também é usada em casos de dilatação das glândulas e de inchanços dolorosos da pele. A infusão e a decocção do bolbo e das folhas servem para o tratamento de tuberculose, febres reumáticas, dores de bexiga e diarreia de sangue.");
        p.setHabitat("Habitat: Florestas e savanas, ocorre nas encostas das montanhas, em áreas rochosas, húmidas e ribeirinhas. Cultivadas em jardins.");
        p.setSpecies_description("Descrição da espécie: Herbácea de 90cm, bolbo largo, estreitando-se num caule curto. Folhas lineares dispostas em rosetas, patentes ou arqueadas subsésseis, com margens mais ou menos onduladas. Flores campanuladas, brancas ou cores-de-rosa. Fruto com aproximadamente 6cm de diâmetro.");
        p.setParts_used("Parte utilizada: Folha e boldo(Nota: devido a sua toxicidade, não pode ser usado de forma isolada, pois o bolbo tem grandes quantidades de alcalóides.)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_thunbergia_lancifolia_t_anderson);
        p.setName("Dores de cabeça");
        p.setCommon_name("Nome vernáculo: Não encontrado;");
        p.setGeographical_location("Localização geográfica: Kwanza norte e Malange;");
        p.setUse("Utitlidade: Tratamento de dores de cabeça, inflamações, bilharziose, doenças da pele, menstruação iregular, vómitos, paludismo, anemia.");
        p.setHabitat("Habitat: Florestas e Savanas");
        p.setSpecies_description("Descrição da espécie: Herbácea vivaz erecta ou subarvusto de 90cm de altura. Folhas simples, opostas, subsésseis, elípticas-oblanceoladas, gleabras. Flores solitárias, axilares, grandes, violetas cenro amarelo, zigomórficas. Fruto, uma cápsula com pubescência fina;");
        p.setParts_used("Parte utilizada: Raíz e Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Dores de cabeça");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Dores de estômago");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_allium_sativum_l);
        p.setName("Dores de ouvido");
        p.setCommon_name("Nome vernáculo: Alho");
        p.setGeographical_location("Localização geográfica: Em todo país;");
        p.setUse("Utitlidade: É regulador de tensão arterial, indicado para o tratamento de tosse e dores de ouvido. É antigripal, anti-inflamatório, antibiótico, anti-séptico. Indicado para indisposição e para cólicas de recém-nascido.");
        p.setHabitat("Habitat: Savanas, lugares húmido");
        p.setSpecies_description("Descrição da espécie: Herbácea perene, aromática de 0,4 a 0,6m de altura, caule pequeno e achatado, folhas lineares, alongadas, cerosas. Flores hermafroditas, brancas ou avermelhadas;");
        p.setParts_used("Parte utilizada: Bolbo e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Espasmos de músculos");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Fadiga crónica");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Febre");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_crinum_macowanii_baker);
        p.setName("Febre");
        p.setCommon_name("Nome vernáculo: Lírio-do-rio(português), Niaza kongo(kikongo);");
        p.setGeographical_location("Localização geográfica: Zaire, Malange, Kwanza Norte;");
        p.setUse("Utitlidade: Usada no tratamento de febres, reumatismo, infecções(urinária e cutânea) também é usada em casos de dilatação das glândulas e de inchanços dolorosos da pele. A infusão e a decocção do bolbo e das folhas servem para o tratamento de tuberculose, febres reumáticas, dores de bexiga e diarreia de sangue.");
        p.setHabitat("Habitat: Florestas e savanas, ocorre nas encostas das montanhas, em áreas rochosas, húmidas e ribeirinhas. Cultivadas em jardins.");
        p.setSpecies_description("Descrição da espécie: Herbácea de 90cm, bolbo largo, estreitando-se num caule curto. Folhas lineares dispostas em rosetas, patentes ou arqueadas subsésseis, com margens mais ou menos onduladas. Flores campanuladas, brancas ou cores-de-rosa. Fruto com aproximadamente 6cm de diâmetro.");
        p.setParts_used("Parte utilizada: Folha e boldo(Nota: devido a sua toxicidade, não pode ser usado de forma isolada, pois o bolbo tem grandes quantidades de alcalóides.)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Fístulas de vaginites");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Gengivites");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_allium_sativum_l);
        p.setName("Gripe");
        p.setCommon_name("Nome vernáculo: Alho");
        p.setGeographical_location("Localização geográfica: Em todo país;");
        p.setUse("Utitlidade: É regulador de tensão arterial, indicado para o tratamento de tosse e dores de ouvido. É antigripal, anti-inflamatório, antibiótico, anti-séptico. Indicado para indisposição e para cólicas de recém-nascido.");
        p.setHabitat("Habitat: Savanas, lugares húmido");
        p.setSpecies_description("Descrição da espécie: Herbácea perene, aromática de 0,4 a 0,6m de altura, caule pequeno e achatado, folhas lineares, alongadas, cerosas. Flores hermafroditas, brancas ou avermelhadas;");
        p.setParts_used("Parte utilizada: Bolbo e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Hemorróidas");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Hemorróidas");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Hepatite");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Hepatite");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Herpes");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Icterícia");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_crinum_macowanii_baker);
        p.setName("Inchanços dolorosos da pele.");
        p.setCommon_name("Nome vernáculo: Lírio-do-rio(português), Niaza kongo(kikongo);");
        p.setGeographical_location("Localização geográfica: Zaire, Malange, Kwanza Norte;");
        p.setUse("Utitlidade: Usada no tratamento de febres, reumatismo, infecções(urinária e cutânea) também é usada em casos de dilatação das glândulas e de inchanços dolorosos da pele. A infusão e a decocção do bolbo e das folhas servem para o tratamento de tuberculose, febres reumáticas, dores de bexiga e diarreia de sangue.");
        p.setHabitat("Habitat: Florestas e savanas, ocorre nas encostas das montanhas, em áreas rochosas, húmidas e ribeirinhas. Cultivadas em jardins.");
        p.setSpecies_description("Descrição da espécie: Herbácea de 90cm, bolbo largo, estreitando-se num caule curto. Folhas lineares dispostas em rosetas, patentes ou arqueadas subsésseis, com margens mais ou menos onduladas. Flores campanuladas, brancas ou cores-de-rosa. Fruto com aproximadamente 6cm de diâmetro.");
        p.setParts_used("Parte utilizada: Folha e boldo(Nota: devido a sua toxicidade, não pode ser usado de forma isolada, pois o bolbo tem grandes quantidades de alcalóides.)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Indigestão");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_allium_sativum_l);
        p.setName("Indisposição");
        p.setCommon_name("Nome vernáculo: Alho");
        p.setGeographical_location("Localização geográfica: Em todo país;");
        p.setUse("Utitlidade: É regulador de tensão arterial, indicado para o tratamento de tosse e dores de ouvido. É antigripal, anti-inflamatório, antibiótico, anti-séptico. Indicado para indisposição e para cólicas de recém-nascido.");
        p.setHabitat("Habitat: Savanas, lugares húmido");
        p.setSpecies_description("Descrição da espécie: Herbácea perene, aromática de 0,4 a 0,6m de altura, caule pequeno e achatado, folhas lineares, alongadas, cerosas. Flores hermafroditas, brancas ou avermelhadas;");
        p.setParts_used("Parte utilizada: Bolbo e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_achyranthes_aspera);
        p.setName("Indução de parto");
        p.setCommon_name("Nome vernánculo: Não encontrado");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Benguela, Namibe;");
        p.setUse("Utitlidade: Usadas para diversos fins medicinais, como indução de parto e cessação de hemorragia pós-parto. Usada no alívio de sintomas de paludismo.");
        p.setHabitat("Habitat: Florestas e Savanas;");
        p.setSpecies_description("Descrição de espécie: Herbácea perene de 1m de altura, lenhosa na base, erecta, mediamente ramificadas, caule pubescente. Folhas opostas, largamente ovadas ou rômbicas, curtamente acuminadas no ápice, acunheadas na base. Flores paniculadas, erectas, pediceladas, tornando-se refletidas, verdes. Fruto, utrículo refletido, cilíndrico. E possui uma emente leticular preta.");
        p.setParts_used("Parte utilizada: Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Infecções de garganta");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Infecções no olho");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_crinum_macowanii_baker);
        p.setName("Infecções(urinária e cutânea)");
        p.setCommon_name("Nome vernáculo: Lírio-do-rio(português), Niaza kongo(kikongo);");
        p.setGeographical_location("Localização geográfica: Zaire, Malange, Kwanza Norte;");
        p.setUse("Utitlidade: Usada no tratamento de febres, reumatismo, infecções(urinária e cutânea) também é usada em casos de dilatação das glândulas e de inchanços dolorosos da pele. A infusão e a decocção do bolbo e das folhas servem para o tratamento de tuberculose, febres reumáticas, dores de bexiga e diarreia de sangue.");
        p.setHabitat("Habitat: Florestas e savanas, ocorre nas encostas das montanhas, em áreas rochosas, húmidas e ribeirinhas. Cultivadas em jardins.");
        p.setSpecies_description("Descrição da espécie: Herbácea de 90cm, bolbo largo, estreitando-se num caule curto. Folhas lineares dispostas em rosetas, patentes ou arqueadas subsésseis, com margens mais ou menos onduladas. Flores campanuladas, brancas ou cores-de-rosa. Fruto com aproximadamente 6cm de diâmetro.");
        p.setParts_used("Parte utilizada: Folha e boldo(Nota: devido a sua toxicidade, não pode ser usado de forma isolada, pois o bolbo tem grandes quantidades de alcalóides.)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Infertilidade");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Infertilidade");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_allium_sativum_l);
        p.setName("Inflamação");
        p.setCommon_name("Nome vernáculo: Alho");
        p.setGeographical_location("Localização geográfica: Em todo país;");
        p.setUse("Utitlidade: É regulador de tensão arterial, indicado para o tratamento de tosse e dores de ouvido. É antigripal, anti-inflamatório, antibiótico, anti-séptico. Indicado para indisposição e para cólicas de recém-nascido.");
        p.setHabitat("Habitat: Savanas, lugares húmido");
        p.setSpecies_description("Descrição da espécie: Herbácea perene, aromática de 0,4 a 0,6m de altura, caule pequeno e achatado, folhas lineares, alongadas, cerosas. Flores hermafroditas, brancas ou avermelhadas;");
        p.setParts_used("Parte utilizada: Bolbo e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_thunbergia_lancifolia_t_anderson);
        p.setName("Inflamação");
        p.setCommon_name("Nome vernáculo: Não encontrado;");
        p.setGeographical_location("Localização geográfica: Kwanza Norte e Malange;");
        p.setUse("Utitlidade: Tratamento de dores de cabeça, inflamações, bilharziose, doenças da pele, menstruação iregular, vómitos, paludismo, anemia.");
        p.setHabitat("Habitat: Florestas e Savanas");
        p.setSpecies_description("Descrição da espécie: Herbácea vivaz erecta ou subarvusto de 90cm de altura. Folhas simples, opostas, subsésseis, elípticas-oblanceoladas, gleabras. Flores solitárias, axilares, grandes, violetas cenro amarelo, zigomórficas. Fruto, uma cápsula com pubescência fina;");
        p.setParts_used("Parte utilizada: Raíz e Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_anacardium_occidentale_l);
        p.setName("Inflamação");
        p.setCommon_name("Nome vernáculo: Cajueiro;");
        p.setGeographical_location("Localização geográfica: Cabinda, Zaire, Bengo, Luanda, Kwanza Sul(é cultivável em todas as províncias);");
        p.setUse("Utitlidade: Usada no tratamento de diarreias, dores abdominais, inflamação, diabetes. Diminui o nível de colesterol no sangue.A casca da árvore também é utilizda como adstringente e tónico.");
        p.setHabitat("Habitat: Florestas, Savanas, Zonas ruderais.");
        p.setSpecies_description("Descrição da espécie: pequena árvore, perene, com tronco curto, sinuoso, com ritidoma cinza e fissurado, de 5 a 12m altura. Copa com ramos terminais pilosos. Folhas simples, espiraladas, alternadas, coriáceas ou semi-coriáceas , concolores, glabras, ovado-obovadas, ápice arredondado, base aguda. Flores paniculadas, rosas. fruto, uma drupa, cinza, pseudofruto vermelho ou amarelado, quando maduror, suculento e carnudo.");
        p.setParts_used("Parte utilizada: Cascas do tronco e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Joanetes");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_thunbergia_lancifolia_t_anderson);
        p.setName("Menstruação irregular");
        p.setCommon_name("Nome vernáculo: Não encontrado;");
        p.setGeographical_location("Localização geográfica: Kwanza Norte e Malange;");
        p.setUse("Utitlidade: Tratamento de dores de cabeça, inflamações, bilharziose, doenças da pele, menstruação iregular, vómitos, paludismo, anemia.");
        p.setHabitat("Habitat: Florestas e Savanas");
        p.setSpecies_description("Descrição da espécie: Herbácea vivaz erecta ou subarvusto de 90cm de altura. Folhas simples, opostas, subsésseis, elípticas-oblanceoladas, gleabras. Flores solitárias, axilares, grandes, violetas cenro amarelo, zigomórficas. Fruto, uma cápsula com pubescência fina;");
        p.setParts_used("Parte utilizada: Raíz e Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Osteoporose");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_thunbergia_lancifolia_t_anderson);
        p.setName("Paludismo");
        p.setCommon_name("Nome vernáculo: Não encontrado;");
        p.setGeographical_location("Localização geográfica: Kwanza Norte e Malange;");
        p.setUse("Utitlidade: Tratamento de dores de cabeça, inflamações, bilharziose, doenças da pele, menstruação iregular, vómitos, paludismo, anemia.");
        p.setHabitat("Habitat: Florestas e Savanas");
        p.setSpecies_description("Descrição da espécie: Herbácea vivaz erecta ou subarvusto de 90cm de altura. Folhas simples, opostas, subsésseis, elípticas-oblanceoladas, gleabras. Flores solitárias, axilares, grandes, violetas cenro amarelo, zigomórficas. Fruto, uma cápsula com pubescência fina;");
        p.setParts_used("Parte utilizada: Raíz e Folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Parasitas intestinais");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Parasitoses");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Pé de atleta");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Pés com rachaduras, esfolados e bolhas");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Picadas de cobras");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Pressão arterial alta(Hipertensão)");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Pressão arterial alta(Hipertensão)");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Prevenção contra o cancro da mama");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Prevenção contra o cancro do fígado");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Prevenção contra o cancro do HIV");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_alternanthera_punges_kunth);
        p.setName("Prisão de ventre(recém nascido)");
        p.setCommon_name("Nome vernáculo: Ochambanda ou Holokoto de mulher(umbundo);");
        p.setGeographical_location("Localização geográfica: Bengo");
        p.setUse("Utitlidade: Tratamento de prisão de ventre em recém-nascidos;.");
        p.setHabitat("Habitat: Florestas e Savanas");
        p.setSpecies_description("Descrição da espécie: Herbácea perene, prostada,  formandos tapetes, até 1m de comprimento. folhas opostas, elípiticas, ápice arrendondado, base acunheada, flores hermafroditas, solitárias, axilares, fruto, utrículo lenticular indeiscente, semente 1, lenticualar, preta, brilhante.;");
        p.setParts_used("Parte utilizada: Raíz");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Psoráses");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Queda de cabelo");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_allium_sativum_l);
        p.setName("Regulador de tensão arterial");
        p.setCommon_name("Nome vernáculo: Alho");
        p.setGeographical_location("Localização geográfica: Em todo país;");
        p.setUse("Utitlidade: É regulador de tensão arterial, indicado para o tratamento de tosse e dores de ouvido. É antigripal, anti-inflamatório, antibiótico, anti-séptico. Indicado para indisposição e para cólicas de recém-nascido.");
        p.setHabitat("Habitat: Savanas, lugares húmido");
        p.setSpecies_description("Descrição da espécie: Herbácea perene, aromática de 0,4 a 0,6m de altura, caule pequeno e achatado, folhas lineares, alongadas, cerosas. Flores hermafroditas, brancas ou avermelhadas;");
        p.setParts_used("Parte utilizada: Bolbo e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Reumatismo");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_anacardium_occidentale_l);
        p.setName("Infecções(urinária e cutânea)");
        p.setCommon_name("Nome vernáculo: Lírio-do-rio(português), Niaza kongo(kikongo);");
        p.setGeographical_location("Localização geográfica: Zaire, Malange, Kwanza Norte;");
        p.setUse("Utitlidade: Usada no tratamento de febres, reumatismo, infecções(urinária e cutânea) também é usada em casos de dilatação das glândulas e de inchanços dolorosos da pele. A infusão e a decocção do bolbo e das folhas servem para o tratamento de tuberculose, febres reumáticas, dores de bexiga e diarreia de sangue.");
        p.setHabitat("Habitat: Florestas e savanas, ocorre nas encostas das montanhas, em áreas rochosas, húmidas e ribeirinhas. Cultivadas em jardins.");
        p.setSpecies_description("Descrição da espécie: Herbácea de 90cm, bolbo largo, estreitando-se num caule curto. Folhas lineares dispostas em rosetas, patentes ou arqueadas subsésseis, com margens mais ou menos onduladas. Flores campanuladas, brancas ou cores-de-rosa. Fruto com aproximadamente 6cm de diâmetro.");
        p.setParts_used("Parte utilizada: Folha e boldo(Nota: devido a sua toxicidade, não pode ser usado de forma isolada, pois o bolbo tem grandes quantidades de alcalóides.)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Sinusite");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_allium_sativum_l);
        p.setName("Tosse");
        p.setCommon_name("Nome vernáculo: Alho");
        p.setGeographical_location("Localização geográfica: Em todo país;");
        p.setUse("Utitlidade: É regulador de tensão arterial, indicado para o tratamento de tosse e dores de ouvido. É antigripal, anti-inflamatório, antibiótico, anti-séptico. Indicado para indisposição e para cólicas de recém-nascido.");
        p.setHabitat("Habitat: Savanas, lugares húmido");
        p.setSpecies_description("Descrição da espécie: Herbácea perene, aromática de 0,4 a 0,6m de altura, caule pequeno e achatado, folhas lineares, alongadas, cerosas. Flores hermafroditas, brancas ou avermelhadas;");
        p.setParts_used("Parte utilizada: Bolbo e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Veias varicosas");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_ferrox_mill);
        p.setName("Verrugas");
        p.setCommon_name("Nome vernáculo: Xandala, Jimbela, Kikalando(kimbundu), Tshandala(umbundu), Sancul(kikongo);");
        p.setGeographical_location("Localização geográfica: Cabinda, Bengo, Luanda, Kwanza sul, Benguela, Huíla;");
        p.setUse("Utitlidade: É uma espécie conhecida por possuir acção no tratamento de múltiplas enfermidades, como cólicas, cólon espamódico, hepatite, amigdalite, infecções de garganta, aftas, fadiga crónica, gengivites, indigestão,diabetes, parasitas intestinais, dor de cabeça, acne, cancro de pele, alergias, dermatites, urticária, prostatite, infecções do sistema urinário,fístulas de vaginites, herpes, verrugas, hemorróidas, amenorreiainfertlidade, icterícia, depressão, pressão arterial alta, asma, sinusite, constipação, psoráses, artrite, reumatismo, osteoporose, caspa, queda de cabela, pés com rachjaduras, esfolados ebolhas, joanetes, pé de atleta, infecções no olho, veias varicosas, espasmos de músculos. Prevenção contra  o cancro da mama, do fígado e contra o HIV.");
        p.setHabitat("Habitat: Florestas, Savanas e base de encostas");
        p.setSpecies_description("Descrição da espécie: herbácea de 2 a 3m de altura, caule único, densamente barbudo com folhas velhas secas, permanecendo no caule. Folhas em roseta compactas, verde-acastanhado ou avermelhadas, geralmentecom espinhos dispersos ao longo da margem. Flores sésseis, dispostas em espigas densas, longas, erectas, laranja-escarlate, ou amarelo-brancas;");
        p.setParts_used("Parte utilizada: Folha (Nota: terapeutas referem que se deve evitar durante a gravidez. Doses elevadas das folhas podem provocar vómitos)");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_aloe_zebrina_bak);
        p.setName("Vertigens");
        p.setCommon_name("Nome vernáculo: Sankulu(kikongo), okandala-kazengue(umbundo);");
        p.setGeographical_location("Localização geográfica: Zaire, Bengo, Luanda, Kwanza sul, Benguela e Bié;;");
        p.setUse("Utitlidade: Tratamento de constipação, abcesso, picadas de cobras(mastigar as folhas) infertilidade, vertigens, febre, dores de estômago, parasitoses, bilharziose, hepatite, hipertensão, hemorróides, caspa e cancro da prostata;");
        p.setHabitat("Habitat: Savanas e Estepes");
        p.setSpecies_description("Descrição da espécie: Herbácea carnuda, vivaz de 10cm a 20cm de comprimento. Folhas em rosetas densas, de 5 a 8 estendidas, lanceoladas, mais ou mmenos mosquedas em ambas páginas, de pintas brancas, revestidas nas margens de espinhos deltóides. Flores em recemos, vermelhos.Fruto, uma cápsula oblongo-trigonal.;");
        p.setParts_used("Parte utilizada: Raíz e folha");
        modelPlantsMedicals.add(p);

        p = new Model_Medicinal_Plants();
        p.setImages(R.drawable.image_plants_thunbergia_lancifolia_t_anderson);
        p.setName("Vómitos");
        p.setCommon_name("Nome vernáculo: Não encontrado;");
        p.setGeographical_location("Localização geográfica: Kwanza Norte e Malange;");
        p.setUse("Utitlidade: Tratamento de dores de cabeça, inflamações, bilharziose, doenças da pele, menstruação iregular, vómitos, paludismo, anemia.");
        p.setHabitat("Habitat: Florestas e Savanas");
        p.setSpecies_description("Descrição da espécie: Herbácea vivaz erecta ou subarvusto de 90cm de altura. Folhas simples, opostas, subsésseis, elípticas-oblanceoladas, gleabras. Flores solitárias, axilares, grandes, violetas cenro amarelo, zigomórficas. Fruto, uma cápsula com pubescência fina;");
        p.setParts_used("Parte utilizada: Raíz e Folha");
        modelPlantsMedicals.add(p);

        return modelPlantsMedicals;
    }*/

}