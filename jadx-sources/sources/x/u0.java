package x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f19731a;

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f19732b;

    /* renamed from: c, reason: collision with root package name */
    public static final u0 f19733c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ u0[] f19734d;

    static {
        u0 u0Var = new u0("Yes", 0);
        f19731a = u0Var;
        u0 u0Var2 = new u0("No", 1);
        f19732b = u0Var2;
        u0 u0Var3 = new u0("NotInitialized", 2);
        f19733c = u0Var3;
        u0[] u0VarArr = {u0Var, u0Var2, u0Var3};
        f19734d = u0VarArr;
        u0.c.j(u0VarArr);
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) f19734d.clone();
    }
}
