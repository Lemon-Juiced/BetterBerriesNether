package lemon_juice.better_berries_nether.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BANEBERRIES = berries(MobEffects.REGENERATION, MobEffects.POISON, MobEffects.WITHER,
            160, 100, 100).build();
    public static final FoodProperties BEHOLDERBERRIES = berries(MobEffects.NIGHT_VISION, MobEffects.BLINDNESS, MobEffects.DARKNESS,
            600, 60, 60).build();
    public static final FoodProperties BITEBERRIES = berries(MobEffects.DAMAGE_BOOST, MobEffects.DIG_SLOWDOWN, MobEffects.WEAKNESS,
            200, 200, 200).build();
    public static final FoodProperties BLOATBERRIES = berries(MobEffects.JUMP, MobEffects.MOVEMENT_SLOWDOWN, MobEffects.SLOW_FALLING,
            160, 60, 60).build();

    public static final FoodProperties BANEBERRY_JUICE = juice(MobEffects.REGENERATION, MobEffects.POISON, MobEffects.WITHER,
            160, 100, 100).build();
    public static final FoodProperties BEHOLDERBERRY_JUICE = juice(MobEffects.NIGHT_VISION, MobEffects.BLINDNESS, MobEffects.DARKNESS,
            600, 60, 60).build();
    public static final FoodProperties BITEBERRY_JUICE = juice(MobEffects.DAMAGE_BOOST, MobEffects.DIG_SLOWDOWN, MobEffects.WEAKNESS,
            200, 200, 200).build();
    public static final FoodProperties BLOATBERRY_JUICE = juice(MobEffects.JUMP, MobEffects.MOVEMENT_SLOWDOWN, MobEffects.SLOW_FALLING,
            160, 60, 60).build();

    public static final FoodProperties BANEBERRY_SMOOTHIE = smoothie(MobEffects.REGENERATION, MobEffects.POISON, MobEffects.WITHER,
            160, 100, 100).build();
    public static final FoodProperties BEHOLDERBERRY_SMOOTHIE = smoothie(MobEffects.NIGHT_VISION, MobEffects.BLINDNESS, MobEffects.DARKNESS,
            600, 60, 60).build();
    public static final FoodProperties BITEBERRY_SMOOTHIE = smoothie(MobEffects.DAMAGE_BOOST, MobEffects.DIG_SLOWDOWN, MobEffects.WEAKNESS,
            200, 200, 200).build();
    public static final FoodProperties BLOATBERRY_SMOOTHIE = smoothie(MobEffects.JUMP, MobEffects.MOVEMENT_SLOWDOWN, MobEffects.SLOW_FALLING,
            160, 60, 60).build();

    public static final FoodProperties BA_BE_BI_MEDLEY = medley(
            MobEffects.REGENERATION, MobEffects.POISON, MobEffects.WITHER,
            MobEffects.NIGHT_VISION, MobEffects.BLINDNESS, MobEffects.DARKNESS,
            MobEffects.DAMAGE_BOOST, MobEffects.DIG_SLOWDOWN, MobEffects.WEAKNESS,
            160, 100, 100,
            600, 60, 60,
            200, 200, 200).build();

    public static final FoodProperties BA_BE_BL_MEDLEY = medley(
            MobEffects.REGENERATION, MobEffects.POISON, MobEffects.WITHER,
            MobEffects.NIGHT_VISION, MobEffects.BLINDNESS, MobEffects.DARKNESS,
            MobEffects.JUMP, MobEffects.MOVEMENT_SLOWDOWN, MobEffects.SLOW_FALLING,
            160, 100, 100,
            600, 60, 60,
            160, 60, 60).build();

    public static final FoodProperties BA_BI_BL_MEDLEY = medley(
            MobEffects.REGENERATION, MobEffects.POISON, MobEffects.WITHER,
            MobEffects.DAMAGE_BOOST, MobEffects.DIG_SLOWDOWN, MobEffects.WEAKNESS,
            MobEffects.JUMP, MobEffects.MOVEMENT_SLOWDOWN, MobEffects.SLOW_FALLING,
            600, 60, 60,
            200, 200, 200,
            160, 60, 60).build();

    public static final FoodProperties BE_BI_BL_MEDLEY = medley(
            MobEffects.NIGHT_VISION, MobEffects.BLINDNESS, MobEffects.DARKNESS,
            MobEffects.DAMAGE_BOOST, MobEffects.DIG_SLOWDOWN, MobEffects.WEAKNESS,
            MobEffects.JUMP, MobEffects.MOVEMENT_SLOWDOWN, MobEffects.SLOW_FALLING,
            600, 60, 60,
            200, 200, 200,
            160, 60, 60).build();

    public static final FoodProperties BA_BE_BI_BL_MEDLEY = medley(
            MobEffects.REGENERATION, MobEffects.POISON, MobEffects.WITHER,
            MobEffects.NIGHT_VISION, MobEffects.BLINDNESS, MobEffects.DARKNESS,
            MobEffects.DAMAGE_BOOST, MobEffects.DIG_SLOWDOWN, MobEffects.WEAKNESS,
            MobEffects.JUMP, MobEffects.MOVEMENT_SLOWDOWN, MobEffects.SLOW_FALLING,
            160, 100, 100,
            600, 60, 60,
            200, 200, 200,
            160, 60, 60).build();

    private static FoodProperties.Builder berries(MobEffect effect1, MobEffect effect2, MobEffect effect3, int time1, int time2, int time3) {
        return (new FoodProperties.Builder())
                .nutrition(2)
                .saturationMod(0.1F)
                .alwaysEat()
                .effect(new MobEffectInstance(effect1, 1, time1), 1f)
                .effect(new MobEffectInstance(effect2, 1, time2), .75f)
                .effect(new MobEffectInstance(effect3, 1, time3), .15f);
    }

    private static FoodProperties.Builder juice(MobEffect effect1, MobEffect effect2, MobEffect effect3, int time1, int time2, int time3) {
        return (new FoodProperties.Builder())
                .nutrition(4)
                .saturationMod(0.2F)
                .alwaysEat()
                .effect(new MobEffectInstance(effect1, 1, time1), 1f)
                .effect(new MobEffectInstance(effect2, 1, time2), .75f)
                .effect(new MobEffectInstance(effect3, 1, time3), .15f);
    }

    private static FoodProperties.Builder medley(MobEffect effect1, MobEffect effect2, MobEffect effect3, MobEffect effect4, MobEffect effect5, MobEffect effect6, MobEffect effect7, MobEffect effect8, MobEffect effect9, int time1, int time2, int time3, int time4, int time5, int time6, int time7, int time8, int time9) {
        return (new FoodProperties.Builder())
                .nutrition(5)
                .saturationMod(1.4F)
                .effect(new MobEffectInstance(effect1, 1, time1), 1f)
                .effect(new MobEffectInstance(effect2, 1, time2), .75f)
                .effect(new MobEffectInstance(effect3, 1, time3), .15f)
                .effect(new MobEffectInstance(effect4, 1, time4), 1f)
                .effect(new MobEffectInstance(effect5, 1, time5), .75f)
                .effect(new MobEffectInstance(effect6, 1, time6), .15f)
                .effect(new MobEffectInstance(effect7, 1, time7), 1f)
                .effect(new MobEffectInstance(effect8, 1, time8), .75f)
                .effect(new MobEffectInstance(effect9, 1, time9), .15f);
    }

    private static FoodProperties.Builder medley(MobEffect effect1, MobEffect effect2, MobEffect effect3, MobEffect effect4, MobEffect effect5, MobEffect effect6, MobEffect effect7, MobEffect effect8, MobEffect effect9, MobEffect effect10, MobEffect effect11, MobEffect effect12, int time1, int time2, int time3, int time4, int time5, int time6, int time7, int time8, int time9, int time10, int time11, int time12) {
        return (new FoodProperties.Builder())
                .nutrition(5)
                .saturationMod(1.4F)
                .effect(new MobEffectInstance(effect1, 1, time1), 1f)
                .effect(new MobEffectInstance(effect2, 1, time2), .75f)
                .effect(new MobEffectInstance(effect3, 1, time3), .15f)
                .effect(new MobEffectInstance(effect4, 1, time4), 1f)
                .effect(new MobEffectInstance(effect5, 1, time5), .75f)
                .effect(new MobEffectInstance(effect6, 1, time6), .15f)
                .effect(new MobEffectInstance(effect7, 1, time7), 1f)
                .effect(new MobEffectInstance(effect8, 1, time8), .75f)
                .effect(new MobEffectInstance(effect9, 1, time9), .15f)
                .effect(new MobEffectInstance(effect10, 1, time10), 1f)
                .effect(new MobEffectInstance(effect11, 1, time11), .75f)
                .effect(new MobEffectInstance(effect12, 1, time12), .15f);
    }

    private static FoodProperties.Builder smoothie(MobEffect effect1, MobEffect effect2, MobEffect effect3, int time1, int time2, int time3) {
        return (new FoodProperties.Builder())
                .nutrition(5)
                .saturationMod(0.3F)
                .alwaysEat()
                .effect(new MobEffectInstance(effect1, 1, time1), 1f)
                .effect(new MobEffectInstance(effect2, 1, time2), .75f)
                .effect(new MobEffectInstance(effect3, 1, time3), .15f);
    }
}
