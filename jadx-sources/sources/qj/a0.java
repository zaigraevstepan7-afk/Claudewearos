package qj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f13538a;

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f13539b;

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f13540c;

    /* renamed from: d, reason: collision with root package name */
    public static final a0 f13541d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a0[] f13542e;

    static {
        a0 a0Var = new a0("DEFAULT", 0);
        f13538a = a0Var;
        a0 a0Var2 = new a0("LAZY", 1);
        f13539b = a0Var2;
        a0 a0Var3 = new a0("ATOMIC", 2);
        f13540c = a0Var3;
        a0 a0Var4 = new a0("UNDISPATCHED", 3);
        f13541d = a0Var4;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3, a0Var4};
        f13542e = a0VarArr;
        u0.c.j(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f13542e.clone();
    }
}
