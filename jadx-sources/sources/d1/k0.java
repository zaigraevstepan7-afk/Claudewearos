package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f4523a;

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f4524b;

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f4525c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k0[] f4526d;

    static {
        k0 k0Var = new k0("Focused", 0);
        f4523a = k0Var;
        k0 k0Var2 = new k0("UnfocusedEmpty", 1);
        f4524b = k0Var2;
        k0 k0Var3 = new k0("UnfocusedNotEmpty", 2);
        f4525c = k0Var3;
        k0[] k0VarArr = {k0Var, k0Var2, k0Var3};
        f4526d = k0VarArr;
        u0.c.j(k0VarArr);
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) f4526d.clone();
    }
}
