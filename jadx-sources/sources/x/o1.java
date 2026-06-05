package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f19664a;

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f19665b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ o1[] f19666c;

    static {
        o1 o1Var = new o1("Vertical", 0);
        f19664a = o1Var;
        o1 o1Var2 = new o1("Horizontal", 1);
        f19665b = o1Var2;
        o1[] o1VarArr = {o1Var, o1Var2};
        f19666c = o1VarArr;
        u0.c.j(o1VarArr);
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) f19666c.clone();
    }
}
