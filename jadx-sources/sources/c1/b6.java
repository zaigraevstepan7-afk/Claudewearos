package c1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    public static final b6 f1942a;

    /* renamed from: b, reason: collision with root package name */
    public static final b6 f1943b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b6[] f1944c;

    static {
        b6 b6Var = new b6("THUMB", 0);
        f1942a = b6Var;
        b6 b6Var2 = new b6("TRACK", 1);
        f1943b = b6Var2;
        b6[] b6VarArr = {b6Var, b6Var2};
        f1944c = b6VarArr;
        u0.c.j(b6VarArr);
    }

    public static b6 valueOf(String str) {
        return (b6) Enum.valueOf(b6.class, str);
    }

    public static b6[] values() {
        return (b6[]) f1944c.clone();
    }
}
