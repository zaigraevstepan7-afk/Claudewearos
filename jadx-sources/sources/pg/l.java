package pg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f12906a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f12907b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f12908c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f12909d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f12910e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ l[] f12911f;

    static {
        l lVar = new l("Disconnected", 0);
        f12906a = lVar;
        l lVar2 = new l("GettingToken", 1);
        f12907b = lVar2;
        l lVar3 = new l("Connecting", 2);
        f12908c = lVar3;
        l lVar4 = new l("Authenticating", 3);
        f12909d = lVar4;
        l lVar5 = new l("Connected", 4);
        f12910e = lVar5;
        f12911f = new l[]{lVar, lVar2, lVar3, lVar4, lVar5};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f12911f.clone();
    }
}
