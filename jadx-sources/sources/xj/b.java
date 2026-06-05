package xj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f20081a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f20082b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f20083c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f20084d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f20085e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f20086f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f20081a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f20082b = bVar2;
        b bVar3 = new b("PARKING", 2);
        f20083c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f20084d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f20085e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f20086f = bVarArr;
        u0.c.j(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f20086f.clone();
    }
}
