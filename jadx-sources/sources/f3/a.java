package f3;

import u0.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6618a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f6619b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f6620c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f6621d;

    static {
        a aVar = new a("On", 0);
        f6618a = aVar;
        a aVar2 = new a("Off", 1);
        f6619b = aVar2;
        a aVar3 = new a("Indeterminate", 2);
        f6620c = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        f6621d = aVarArr;
        c.j(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f6621d.clone();
    }
}
