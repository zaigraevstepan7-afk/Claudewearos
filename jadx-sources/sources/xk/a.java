package xk;

import u0.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f20114a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f20115b;

    static {
        a aVar = new a("VIEWMODEL_SCOPE_FACTORY", 0);
        f20114a = aVar;
        a[] aVarArr = {aVar};
        f20115b = aVarArr;
        c.j(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20115b.clone();
    }
}
