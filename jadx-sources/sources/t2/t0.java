package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t0 f15638a;

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f15639b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ t0[] f15640c;

    static {
        t0 t0Var = new t0("Min", 0);
        f15638a = t0Var;
        t0 t0Var2 = new t0("Max", 1);
        f15639b = t0Var2;
        t0[] t0VarArr = {t0Var, t0Var2};
        f15640c = t0VarArr;
        u0.c.j(t0VarArr);
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) f15640c.clone();
    }
}
