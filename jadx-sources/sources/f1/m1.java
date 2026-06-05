package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class m1 {
    public static final /* synthetic */ m1[] A;

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f6387a;

    /* renamed from: b, reason: collision with root package name */
    public static final m1 f6388b;

    /* renamed from: c, reason: collision with root package name */
    public static final m1 f6389c;

    /* renamed from: d, reason: collision with root package name */
    public static final m1 f6390d;

    /* renamed from: e, reason: collision with root package name */
    public static final m1 f6391e;

    /* renamed from: f, reason: collision with root package name */
    public static final m1 f6392f;

    /* renamed from: z, reason: collision with root package name */
    public static final m1 f6393z;

    static {
        m1 m1Var = new m1("Invalid", 0);
        f6387a = m1Var;
        m1 m1Var2 = new m1("Cancelled", 1);
        f6388b = m1Var2;
        m1 m1Var3 = new m1("InitialPending", 2);
        f6389c = m1Var3;
        m1 m1Var4 = new m1("RecomposePending", 3);
        f6390d = m1Var4;
        m1 m1Var5 = new m1("Recomposing", 4);
        f6391e = m1Var5;
        m1 m1Var6 = new m1("ApplyPending", 5);
        f6392f = m1Var6;
        m1 m1Var7 = new m1("Applied", 6);
        f6393z = m1Var7;
        m1[] m1VarArr = {m1Var, m1Var2, m1Var3, m1Var4, m1Var5, m1Var6, m1Var7};
        A = m1VarArr;
        u0.c.j(m1VarArr);
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) A.clone();
    }
}
