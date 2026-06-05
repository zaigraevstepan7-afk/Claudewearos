package rc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f14353a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f14354b;

    /* renamed from: c, reason: collision with root package name */
    public static final n f14355c;

    /* renamed from: d, reason: collision with root package name */
    public static final n f14356d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n[] f14357e;

    static {
        n nVar = new n("SUCCESS", 0);
        f14353a = nVar;
        n nVar2 = new n("PERMANENT_FAILURE", 1);
        f14354b = nVar2;
        n nVar3 = new n("RETRIABLE_FAILURE", 2);
        f14355c = nVar3;
        n nVar4 = new n("BUFFERED", 3);
        f14356d = nVar4;
        f14357e = new n[]{nVar, nVar2, nVar3, nVar4};
    }

    public static n[] values() {
        return (n[]) f14357e.clone();
    }
}
