package aa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f224a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f225b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f226c;

    static {
        a aVar = new a("PORTRAIT", 0);
        f224a = aVar;
        a aVar2 = new a("LANDSCAPE", 1);
        f225b = aVar2;
        a[] aVarArr = {aVar, aVar2};
        f226c = aVarArr;
        u0.c.j(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f226c.clone();
    }
}
