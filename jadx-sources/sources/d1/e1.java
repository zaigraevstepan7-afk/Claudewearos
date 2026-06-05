package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e1 f4498a;

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f4499b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e1[] f4500c;

    static {
        e1 e1Var = new e1("Filled", 0);
        f4498a = e1Var;
        e1 e1Var2 = new e1("Outlined", 1);
        f4499b = e1Var2;
        e1[] e1VarArr = {e1Var, e1Var2};
        f4500c = e1VarArr;
        u0.c.j(e1VarArr);
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) f4500c.clone();
    }
}
