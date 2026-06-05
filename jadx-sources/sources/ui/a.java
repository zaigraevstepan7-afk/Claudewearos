package ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f17085a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f17086b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f17087c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f17088d;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f17085a = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f17086b = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f17087c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f17088d = aVarArr;
        u0.c.j(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f17088d.clone();
    }
}
