package b0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f1446a;

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f1447b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v0[] f1448c;

    static {
        v0 v0Var = new v0("Min", 0);
        f1446a = v0Var;
        v0 v0Var2 = new v0("Max", 1);
        f1447b = v0Var2;
        v0[] v0VarArr = {v0Var, v0Var2};
        f1448c = v0VarArr;
        u0.c.j(v0VarArr);
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) f1448c.clone();
    }
}
