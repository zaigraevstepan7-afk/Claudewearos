package ud;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.e0;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f16983a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f16984b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f16985c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f16986d;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f16987e;

    /* renamed from: f, reason: collision with root package name */
    public static Boolean f16988f;

    /* renamed from: g, reason: collision with root package name */
    public static Boolean f16989g;

    /* renamed from: h, reason: collision with root package name */
    public static Boolean f16990h;

    /* renamed from: i, reason: collision with root package name */
    public static String f16991i;
    public static int j;

    public static void a(Context context, Throwable th2) {
        try {
            e0.i(context);
        } catch (Exception e10) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e10);
        }
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : bArr) {
            char[] cArr2 = f16984b;
            cArr[i10] = cArr2[(b10 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b10 & 15];
            i10 += 2;
        }
        return new String(cArr);
    }

    public static String c(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = (bArr[i10] & 240) >>> 4;
            char[] cArr = f16983a;
            sb2.append(cArr[i11]);
            sb2.append(cArr[bArr[i10] & 15]);
        }
        return sb2.toString();
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean e(Object[] objArr, nd.d dVar) {
        int length = objArr != null ? objArr.length : 0;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!e0.l(objArr[i10], dVar)) {
                i10++;
            } else if (i10 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static long f(InputStream inputStream, OutputStream outputStream, boolean z2) {
        byte[] bArr = new byte[1024];
        long j4 = 0;
        while (true) {
            try {
                int i10 = inputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    break;
                }
                j4 += i10;
                outputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                if (z2) {
                    d(inputStream);
                    d(outputStream);
                }
                throw th2;
            }
        }
        if (z2) {
            d(inputStream);
            d(outputStream);
        }
        return j4;
    }

    public static byte[] g(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String h(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static String i() throws Throwable {
        BufferedReader bufferedReader;
        if (f16991i == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f16991i = Application.getProcessName();
            } else {
                int iMyPid = j;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    j = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        String str = "/proc/" + iMyPid + "/cmdline";
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            try {
                                String line = bufferedReader.readLine();
                                e0.i(line);
                                strTrim = line.trim();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedReader2 = bufferedReader;
                                d(bufferedReader2);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (IOException unused2) {
                        bufferedReader = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    d(bufferedReader);
                }
                f16991i = strTrim;
            }
        }
        return f16991i;
    }

    public static byte[] j(Context context, String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        PackageInfo packageInfoD = wd.b.a(context).d(64, str);
        Signature[] signatureArr = packageInfoD.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i10 = 0;
            while (true) {
                if (i10 >= 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i10++;
            }
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoD.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean l(Context context) {
        if (f16987e == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z2 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z2 = true;
            }
            f16987e = Boolean.valueOf(z2);
        }
        return f16987e.booleanValue();
    }

    public static boolean m(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f16985c == null) {
            f16985c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        f16985c.booleanValue();
        return p(context) && k();
    }

    public static byte[] n(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 2;
            bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
            i10 = i11;
        }
        return bArr;
    }

    public static void o(StringBuilder sb2, HashMap map) {
        sb2.append("{");
        boolean z2 = true;
        for (String str : map.keySet()) {
            if (!z2) {
                sb2.append(",");
            }
            String str2 = (String) map.get(str);
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\":");
            if (str2 == null) {
                sb2.append("null");
            } else {
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\"");
            }
            z2 = false;
        }
        sb2.append("}");
    }

    public static boolean p(Context context) {
        if (f16986d == null) {
            f16986d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f16986d.booleanValue();
    }
}
