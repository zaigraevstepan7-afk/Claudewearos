package w3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f18499a;

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f18500b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e0[] f18501c;

    static {
        e0 e0Var = new e0("Inherit", 0);
        f18499a = e0Var;
        e0 e0Var2 = new e0("SecureOn", 1);
        f18500b = e0Var2;
        e0[] e0VarArr = {e0Var, e0Var2, new e0("SecureOff", 2)};
        f18501c = e0VarArr;
        u0.c.j(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f18501c.clone();
    }
}
