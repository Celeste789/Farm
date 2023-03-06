package com.celes.proyecto.services;

import com.celes.proyecto.entities.Chicken;
import com.celes.proyecto.entities.Farm;
import com.celes.proyecto.exceptions.AmountChickenException;
import com.celes.proyecto.repositories.ChickenRepository;
import com.celes.proyecto.repositories.FarmRepository;
import org.springframework.stereotype.Service;

@Service
public class ChickenService {
    private FarmRepository farmRepository;
    private ChickenRepository chickenRepository;

    public void generateChicken(long farmId, int amount) throws AmountChickenException {
        Farm farm = farmRepository.findByID(farmId);
        int chickenCount = chickenRepository.findAll().size();
        for(int i = 1; i <= amount; i++){
            if(chickenCount <= farm.getChickenCapacity()){
                Chicken newChicken = new Chicken();
                chickenRepository.save(newChicken);
            }
            else{
                throw new AmountChickenException("There's too many chickens!");
            }
        }
    }


    public int eat(int i) {
        return 0;
    }
    /*
    public int eat(int amount){
        int eatCount = 0;
        List<Chicken> chickenList = new ArrayList<>();
        chickenList = chickenRepository.findAll();
        for (int i = 0; i <= 5; i++){
            Chicken chicken = new Chicken(i+7);
            chickenList.add(chicken);
        }
        for (Chicken chicken : chickenList) {
            if (!chicken.isEgg()) {
                for (int i = 0; i <= amount; i++) {
                    System.out.println("Chonk!");
                    eatCount++;
                }
            }
        }
        return eatCount;
    }
*/
}

//Crear una entity y su repositorio de las granjas -> las gallinas tienen que estar asociadas a una granja