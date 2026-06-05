package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final k1 f17710a;

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f17711b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k1[] f17712c;

    static {
        k1 k1Var = new k1("Min", 0);
        f17710a = k1Var;
        k1 k1Var2 = new k1("Max", 1);
        f17711b = k1Var2;
        k1[] k1VarArr = {k1Var, k1Var2};
        f17712c = k1VarArr;
        u0.c.j(k1VarArr);
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) f17712c.clone();
    }
}
