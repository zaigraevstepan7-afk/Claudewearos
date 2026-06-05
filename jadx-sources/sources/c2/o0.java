package c2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f3025a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ o0[] f3026b;

    static {
        o0 o0Var = new o0("CounterClockwise", 0);
        f3025a = o0Var;
        o0[] o0VarArr = {o0Var, new o0("Clockwise", 1)};
        f3026b = o0VarArr;
        u0.c.j(o0VarArr);
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) f3026b.clone();
    }
}
