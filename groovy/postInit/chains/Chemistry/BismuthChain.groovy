ROASTER = recipemap('roaster')
BR = recipemap('batch_reactor')
DISTILLERY = recipemap('distillery')
MIXER = recipemap('mixer')
CRYSTALLIZER = recipemap('crystallizer')
EBF = recipemap('electric_blast_furnace')

ROASTER.recipeBuilder()
        .inputs(metaitem('dustBismuthinite') * 5)
        .fluidInputs(fluid('oxygen') * 9000)
        .outputs(metaitem('dustBismuthIiiOxide') * 5)
        .fluidOutputs(fluid('sulfur_dioxide') * 3000)
        .EUt(120)
        .duration(120)
        .buildAndRegister()