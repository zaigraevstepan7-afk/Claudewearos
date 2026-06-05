package r8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f13823c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f13824d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b[] f13825e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13826a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13827b;

    static {
        b bVar = new b("ENABLED", 0, true, true);
        f13823c = bVar;
        b bVar2 = new b("READ_ONLY", 1, true, false);
        b bVar3 = new b("WRITE_ONLY", 2, false, true);
        b bVar4 = new b("DISABLED", 3, false, false);
        f13824d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f13825e = bVarArr;
        u0.c.j(bVarArr);
    }

    public b(String str, int i10, boolean z2, boolean z10) {
        this.f13826a = z2;
        this.f13827b = z10;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13825e.clone();
    }
}
