package sj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15039a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f15040b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f15041c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f15042d;

    static {
        a aVar = new a("SUSPEND", 0);
        f15039a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f15040b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f15041c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f15042d = aVarArr;
        u0.c.j(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15042d.clone();
    }
}
