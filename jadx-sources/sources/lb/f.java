package lb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {
    public static final /* synthetic */ wi.b A;

    /* renamed from: a, reason: collision with root package name */
    public static final a f10264a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f10265b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f10266c;

    /* renamed from: d, reason: collision with root package name */
    public static final f f10267d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f10268e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f10269f;

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ f[] f10270z;

    static {
        f fVar = new f("ULTRA", 0);
        f10265b = fVar;
        f fVar2 = new f("HIGH", 1);
        f10266c = fVar2;
        f fVar3 = new f("MEDIUM", 2);
        f10267d = fVar3;
        f fVar4 = new f("LOW", 3);
        f10268e = fVar4;
        f fVar5 = new f("CUSTOM", 4);
        f10269f = fVar5;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f10270z = fVarArr;
        A = u0.c.j(fVarArr);
        f10264a = new a();
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f10270z.clone();
    }
}
