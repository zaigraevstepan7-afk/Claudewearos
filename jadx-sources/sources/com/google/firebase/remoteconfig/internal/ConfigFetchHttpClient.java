package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import i4.a;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import zh.c;
import zh.d;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f4307h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4308a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4309b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4310c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4311d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4312e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4313f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4314g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j, long j4) {
        this.f4308a = context;
        this.f4309b = str;
        this.f4310c = str2;
        Matcher matcher = f4307h.matcher(str);
        this.f4311d = matcher.matches() ? matcher.group(1) : null;
        this.f4312e = "firebase";
        this.f4313f = j;
        this.f4314g = j4;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i10 = bufferedReader.read();
            if (i10 == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) i10);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l10) throws PackageManager.NameNotFoundException, c {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new c("Fetch failed: Firebase installation id is null.");
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.f4309b);
        Context context = this.f4308a;
        Locale locale = context.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        int i10 = Build.VERSION.SDK_INT;
        map2.put("languageCode", locale.toLanguageTag());
        map2.put("platformVersion", Integer.toString(i10));
        map2.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put("appBuild", Long.toString(i10 >= 28 ? a.f(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put("packageName", context.getPackageName());
        map2.put("sdkVersion", "22.0.0");
        map2.put("analyticsUserProperties", new JSONObject(map));
        if (l10 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map2.put("firstOpenTime", simpleDateFormat.format(l10));
        }
        return new JSONObject(map2);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f4311d + "/namespaces/" + this.f4312e + ":fetch").openConnection();
        } catch (IOException e10) {
            throw new d(e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[LOOP:0: B:13:0x0097->B:15:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf A[Catch: all -> 0x017f, IOException | JSONException -> 0x0181, IOException -> 0x0183, TRY_LEAVE, TryCatch #15 {all -> 0x017f, blocks: (B:16:0x00b3, B:18:0x00cf, B:68:0x0185, B:69:0x018e, B:70:0x018f, B:71:0x0196), top: B:106:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0185 A[Catch: all -> 0x017f, IOException | JSONException -> 0x0181, IOException -> 0x0183, TRY_ENTER, TryCatch #15 {all -> 0x017f, blocks: (B:16:0x00b3, B:18:0x00cf, B:68:0x0185, B:69:0x018e, B:70:0x018f, B:71:0x0196), top: B:106:0x009b }] */
    @androidx.annotation.Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ai.i fetch(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, java.lang.Long r13, java.util.Date r14) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date):ai.i");
    }
}
