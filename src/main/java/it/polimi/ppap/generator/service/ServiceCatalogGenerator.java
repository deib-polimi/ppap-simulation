package it.polimi.ppap.generator.service;

import it.polimi.deib.ppap.node.services.Service;
import peersim.core.CommonState;

import java.util.*;

public class ServiceCatalogGenerator {

    static Random random = CommonState.r;

    final int catalogSize;
    final long baseServiceMemory;
    final short serviceMemoryMultiplier;
    final float targetRT;

    public ServiceCatalogGenerator(
            int catalogSize,
            long baseServiceMemory,
            short serviceMemoryMultiplier,
            float targetRT){
        this.catalogSize = catalogSize;
        this.baseServiceMemory = baseServiceMemory;
        this.serviceMemoryMultiplier = serviceMemoryMultiplier;
        this.targetRT = targetRT;
    }

    public  Set<Service> generateCatalog(){
        Set<Service> serviceCatalog = new HashSet<>();
        ServiceGenerator serviceGenerator = new ServiceGenerator(baseServiceMemory, serviceMemoryMultiplier);
        for(int i = 0; i < catalogSize; i++){
            Service service = serviceGenerator.nextService(70);//TODO
            serviceCatalog.add(service);
        }
        return serviceCatalog;
    }
}
