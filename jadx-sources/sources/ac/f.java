package ac;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f379a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f380b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f381c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f382d;

    static {
        f fVar = new f("NETWORK_UNMETERED", 0);
        f379a = fVar;
        f fVar2 = new f("DEVICE_IDLE", 1);
        f380b = fVar2;
        f fVar3 = new f("DEVICE_CHARGING", 2);
        f381c = fVar3;
        f382d = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f382d.clone();
    }
}
