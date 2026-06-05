package pi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f12993a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f12994b;

    static {
        b bVar = new b("WARNING", 0);
        f12993a = bVar;
        b[] bVarArr = {bVar, new b("ERROR", 1), new b("HIDDEN", 2)};
        f12994b = bVarArr;
        u0.c.j(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f12994b.clone();
    }
}
