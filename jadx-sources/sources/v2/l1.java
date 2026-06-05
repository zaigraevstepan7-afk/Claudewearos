package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final l1 f17721a;

    /* renamed from: b, reason: collision with root package name */
    public static final l1 f17722b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l1[] f17723c;

    static {
        l1 l1Var = new l1("Width", 0);
        f17721a = l1Var;
        l1 l1Var2 = new l1("Height", 1);
        f17722b = l1Var2;
        l1[] l1VarArr = {l1Var, l1Var2};
        f17723c = l1VarArr;
        u0.c.j(l1VarArr);
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) f17723c.clone();
    }
}
