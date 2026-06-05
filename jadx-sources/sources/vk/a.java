package vk;

import u0.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18134a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f18135b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f18136c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f18137d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f18138e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f18139f;

    static {
        a aVar = new a("DEBUG", 0);
        f18134a = aVar;
        a aVar2 = new a("INFO", 1);
        f18135b = aVar2;
        a aVar3 = new a("WARNING", 2);
        f18136c = aVar3;
        a aVar4 = new a("ERROR", 3);
        f18137d = aVar4;
        a aVar5 = new a("NONE", 4);
        f18138e = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f18139f = aVarArr;
        c.j(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f18139f.clone();
    }
}
