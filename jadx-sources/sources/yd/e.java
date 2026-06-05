package yd;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f20284e = null;

    /* renamed from: f, reason: collision with root package name */
    public static String f20285f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f20286g = false;

    /* renamed from: h, reason: collision with root package name */
    public static int f20287h = -1;

    /* renamed from: i, reason: collision with root package name */
    public static Boolean f20288i;

    /* renamed from: m, reason: collision with root package name */
    public static i f20291m;

    /* renamed from: n, reason: collision with root package name */
    public static j f20292n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20293a;
    public static final ThreadLocal j = new ThreadLocal();

    /* renamed from: k, reason: collision with root package name */
    public static final ag.a f20289k = new ag.a(12);

    /* renamed from: l, reason: collision with root package name */
    public static final y9.a f20290l = new y9.a();

    /* renamed from: b, reason: collision with root package name */
    public static final ef.f f20281b = new ef.f();

    /* renamed from: c, reason: collision with root package name */
    public static final h9.a f20282c = new h9.a(17);

    /* renamed from: d, reason: collision with root package name */
    public static final lh.e f20283d = new lh.e();

    public e(Context context) {
        this.f20293a = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (e0.l(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #3 {all -> 0x0085, blocks: (B:7:0x004b, B:11:0x007f, B:18:0x008b, B:21:0x0091, B:24:0x00a5, B:102:0x020d, B:103:0x0217, B:106:0x021a, B:107:0x021b, B:108:0x0222, B:125:0x0282, B:126:0x0293, B:109:0x0223, B:111:0x0241, B:113:0x024e, B:123:0x027a, B:124:0x0281, B:127:0x0294, B:128:0x02c0), top: B:147:0x004b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yd.e c(android.content.Context r22, yd.d r23, java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.e.c(android.content.Context, yd.d, java.lang.String):yd.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018f A[Catch: all -> 0x00e9, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00e9, blocks: (B:3:0x0002, B:63:0x00de, B:65:0x00e4, B:72:0x0108, B:102:0x018f, B:110:0x01a2, B:128:0x0221, B:129:0x0224, B:123:0x0219, B:70:0x00ed, B:131:0x0226, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:61:0x00db, B:21:0x004a, B:44:0x009e, B:47:0x00a1, B:54:0x00b9, B:62:0x00dd, B:60:0x00bf), top: B:137:0x0002, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[Catch: all -> 0x0037, TryCatch #9 {, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b6, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x004f, B:27:0x0053, B:30:0x005c, B:32:0x0064, B:35:0x006b, B:42:0x0095, B:43:0x009d, B:38:0x0072, B:40:0x0078, B:41:0x0087, B:46:0x00a0, B:49:0x00a3, B:50:0x00ad, B:17:0x003f), top: B:143:0x0027, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.e.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static int e(Context context, String str, boolean z2, boolean z10) throws Throwable {
        Throwable th2;
        Exception exc;
        boolean z11;
        try {
            try {
                boolean z12 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z2 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) f20289k.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z13 = false;
                            int i10 = cursorQuery.getInt(0);
                            if (i10 > 0) {
                                synchronized (e.class) {
                                    try {
                                        f20285f = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f20287h = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z11 = cursorQuery.getInt(columnIndex2) != 0;
                                            f20286g = z11;
                                        } else {
                                            z11 = false;
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                                h hVar = (h) j.get();
                                if (hVar == null || hVar.f20301a != null) {
                                    z12 = false;
                                } else {
                                    hVar.f20301a = cursorQuery;
                                }
                                cursor = z12 ? null : cursorQuery;
                                z13 = z11;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z10 && z13) {
                                throw new a("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i10;
                        }
                    } catch (Exception e10) {
                        exc = e10;
                        if (exc instanceof a) {
                            throw exc;
                        }
                        throw new a("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (Throwable th4) {
                        cursor = cursorQuery;
                        th2 = th4;
                        if (cursor == null) {
                            throw th2;
                        }
                        cursor.close();
                        throw th2;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new a("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e11) {
                exc = e11;
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    public static void f(ClassLoader classLoader) throws a {
        try {
            j jVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                jVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            f20292n = jVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new a("Failed to instantiate dynamite loader", e10);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f20288i)) {
            return true;
        }
        boolean z2 = false;
        if (f20288i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (nd.f.f12280b.d(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z2 = true;
            }
            f20288i = Boolean.valueOf(z2);
            if (z2 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f20286g = true;
            }
        }
        if (!z2) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z2;
    }

    public static i h(Context context) {
        i iVar;
        synchronized (e.class) {
            i iVar2 = f20291m;
            if (iVar2 != null) {
                return iVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    iVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    iVar = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (iVar != null) {
                    f20291m = iVar;
                    return iVar;
                }
            } catch (Exception e10) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e10.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws a {
        try {
            return (IBinder) this.f20293a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new a("Failed to instantiate module class: ".concat(str), e10);
        }
    }
}
