package xa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f19859a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f19860b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ e[] f19861c;

    static {
        e eVar = new e("APP_ICON", 0);
        f19859a = eVar;
        e eVar2 = new e("FOLDER_ICON", 1);
        f19860b = eVar2;
        e[] eVarArr = {eVar, eVar2};
        f19861c = eVarArr;
        u0.c.j(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f19861c.clone();
    }
}
