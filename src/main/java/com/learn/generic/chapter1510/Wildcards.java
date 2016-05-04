package com.learn.generic.chapter1510;

/**
 * @author zhangfb
 */
public class Wildcards {

    static void rawArgs(Holder holder, Object arg) {
        holder.set(arg);
        holder.set(new Wildcards());
        Object obj = holder.get();
    }

    static void unboundArg(Holder<?> holder, Object arg) {
        // holder.set(arg); // error
        // holder.set(new Wildcards()); // error
        Object obj = holder.get();
    }

    static <T> T exact1(Holder<T> holder) {
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T arg) {
        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T> T wildSubtype(Holder<? extends T> holder, T arg) {
        // holder.set(arg); // error
        T t = holder.get();
        return t;
    }

    static <T> void wildSupertype(Holder<? super T> holder, T arg) {
        holder.set(arg);
        // T t = holder.get(); // error
        Object obj = holder.get();
    }

    public static void main(String[] args) {
        Holder raw = new Holder<>();
        Holder<Long> qualified = new Holder<>();
        Holder<?> unbound = new Holder<>();
        Holder<? extends Long> bound = new Holder<>();
        Long lng = 1L;

        rawArgs(raw, lng);
        rawArgs(qualified, lng);
        rawArgs(unbound, lng);
        rawArgs(bound, lng);

        unboundArg(raw, lng);
        unboundArg(qualified, lng);
        unboundArg(unbound, lng);
        unboundArg(bound, lng);

        Object r1 = exact1(raw);
        Long r2 = exact1(qualified);
        Object r3 = exact1(unbound);
        Long r4 = exact1(bound);

        //Long r5 = exact2(raw, lng);
        Long r6 = exact2(qualified, lng);
        //Long r7 = exact2(unbound, lng);
        //Long r8 = exact2(bound, lng);

        //Long r9 = wildSubtype(raw, lng);
        Long r10 = wildSubtype(qualified, lng);
        //Long r11= wildSubtype(unbound, lng);
        //Long r12 = wildSubtype(bound, lng);

        wildSupertype(raw, lng);
        wildSupertype(qualified, lng);
        //wildSupertype(unbound, lng);
        //wildSupertype(bound, lng);
    }
}
