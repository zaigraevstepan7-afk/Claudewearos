package k8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f9472a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f9473b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f9474c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h[] f9475d;

    static {
        h hVar = new h("MEMORY_CACHE", 0);
        f9472a = hVar;
        h hVar2 = new h("MEMORY", 1);
        f9473b = hVar2;
        h hVar3 = new h("DISK", 2);
        f9474c = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3, new h("NETWORK", 3)};
        f9475d = hVarArr;
        u0.c.j(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f9475d.clone();
    }
}
