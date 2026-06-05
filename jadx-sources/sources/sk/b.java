package sk;

import u0.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f15087a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f15088b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b[] f15089c;

    static {
        b bVar = new b("Singleton", 0);
        f15087a = bVar;
        b bVar2 = new b("Factory", 1);
        f15088b = bVar2;
        b[] bVarArr = {bVar, bVar2, new b("Scoped", 2)};
        f15089c = bVarArr;
        c.j(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f15089c.clone();
    }
}
