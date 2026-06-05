package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static final d2 f17606a;

    /* renamed from: b, reason: collision with root package name */
    public static final d2 f17607b;

    /* renamed from: c, reason: collision with root package name */
    public static final d2 f17608c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d2[] f17609d;

    static {
        d2 d2Var = new d2("ContinueTraversal", 0);
        f17606a = d2Var;
        d2 d2Var2 = new d2("SkipSubtreeAndContinueTraversal", 1);
        f17607b = d2Var2;
        d2 d2Var3 = new d2("CancelTraversal", 2);
        f17608c = d2Var3;
        d2[] d2VarArr = {d2Var, d2Var2, d2Var3};
        f17609d = d2VarArr;
        u0.c.j(d2VarArr);
    }

    public static d2 valueOf(String str) {
        return (d2) Enum.valueOf(d2.class, str);
    }

    public static d2[] values() {
        return (d2[]) f17609d.clone();
    }
}
