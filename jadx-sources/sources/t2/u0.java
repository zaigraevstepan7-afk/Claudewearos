package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f15647a;

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f15648b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u0[] f15649c;

    static {
        u0 u0Var = new u0("Width", 0);
        f15647a = u0Var;
        u0 u0Var2 = new u0("Height", 1);
        f15648b = u0Var2;
        u0[] u0VarArr = {u0Var, u0Var2};
        f15649c = u0VarArr;
        u0.c.j(u0VarArr);
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) f15649c.clone();
    }
}
