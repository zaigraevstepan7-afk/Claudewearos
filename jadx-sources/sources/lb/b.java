package lb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10141a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f10142b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f10143c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f10144d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f10145e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f10146f;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ wi.b f10147z;

    static {
        b bVar = new b("DEFAULT", 0);
        f10142b = bVar;
        b bVar2 = new b("CIRCLE", 1);
        f10143c = bVar2;
        b bVar3 = new b("STAR", 2);
        f10144d = bVar3;
        b bVar4 = new b("SQUARE", 3);
        f10145e = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f10146f = bVarArr;
        f10147z = u0.c.j(bVarArr);
        f10141a = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f10146f.clone();
    }
}
